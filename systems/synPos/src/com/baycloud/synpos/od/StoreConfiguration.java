package com.baycloud.synpos.od;

import com.baycloud.synpos.xt.*;

import java.sql.ResultSet;

/**
 * <p>Title: synPOS</p>
 *
 * <p>Description: synPOS is a desktop POS (Point Of Sale) client for online
 * ERP, eCommerce, and CRM systems. Released under the GNU General Public
 * License. Absolutely no warranty. Use at your own risk.</p>
 *
 * <p>Copyright: Copyright (c) 2006 synPOS.com</p>
 *
 * <p>Website: www.synpos.com</p>
 *
 * @author H.Q.
 * @version 0.9.1
 */
public class StoreConfiguration {
    public static boolean set(String key, String value) {
        try {
            StoreDB db = new StoreDB();
            ResultSet rs = db.query(
                    "select * from configuration where configuration_key = '" +
                    StoreDB.escape(key) + "'");
            if (rs.next()) {
                db.update("update configuration set configuration_value = '" +
                          StoreDB.escape(value) + "' where configuration_key = '" +
                          StoreDB.escape(key) + "'");
            } else {
                db.update("insert into configuration values(NULL, '" +
                          StoreDB.escape(key) +
                          "', '" + StoreDB.escape(value) + "')");
            }
            //db.shutdown();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static String get(String key) {
        String value = null;

        try {
            StoreDB db = new StoreDB();
            ResultSet rs = db.query(
                    "select * from configuration where configuration_key = '" +
                    StoreDB.escape(key) +
                    "'");
            if (rs.next()) {
                value = rs.getString("configuration_value");
            }

            //db.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void delete(String key) {
        try {
            StoreDB db = new StoreDB();
            db.update(
                    "delete from configuration where configuration_key = '" +
                    StoreDB.escape(key) +
                    "'");
            //db.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
