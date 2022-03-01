package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_mongodb_app_TournamentRealmProxy extends com.mongodb.app.Tournament
    implements RealmObjectProxy, com_mongodb_app_TournamentRealmProxyInterface {

    static final class TournamentColumnInfo extends ColumnInfo {
        long idColKey;
        long _partitionColKey;
        long nameColKey;
        long gameColKey;
        long participantColKey;
        long locationColKey;
        long tournamentTypeColKey;
        long dateColKey;

        TournamentColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Tournament");
            this.idColKey = addColumnDetails("id", "_id", objectSchemaInfo);
            this._partitionColKey = addColumnDetails("_partition", "_partition", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.gameColKey = addColumnDetails("game", "game", objectSchemaInfo);
            this.participantColKey = addColumnDetails("participant", "participant", objectSchemaInfo);
            this.locationColKey = addColumnDetails("location", "location", objectSchemaInfo);
            this.tournamentTypeColKey = addColumnDetails("tournamentType", "tournamentType", objectSchemaInfo);
            this.dateColKey = addColumnDetails("date", "date", objectSchemaInfo);
        }

        TournamentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TournamentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TournamentColumnInfo src = (TournamentColumnInfo) rawSrc;
            final TournamentColumnInfo dst = (TournamentColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst._partitionColKey = src._partitionColKey;
            dst.nameColKey = src.nameColKey;
            dst.gameColKey = src.gameColKey;
            dst.participantColKey = src.participantColKey;
            dst.locationColKey = src.locationColKey;
            dst.tournamentTypeColKey = src.tournamentTypeColKey;
            dst.dateColKey = src.dateColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TournamentColumnInfo columnInfo;
    private ProxyState<com.mongodb.app.Tournament> proxyState;

    com_mongodb_app_TournamentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TournamentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.mongodb.app.Tournament>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$_partition() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo._partitionColKey);
    }

    @Override
    public void realmSet$_partition(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field '_partition' to null.");
            }
            row.getTable().setString(columnInfo._partitionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field '_partition' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo._partitionColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$game() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.gameColKey);
    }

    @Override
    public void realmSet$game(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'game' to null.");
            }
            row.getTable().setString(columnInfo.gameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'game' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.gameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$participant() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.participantColKey);
    }

    @Override
    public void realmSet$participant(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'participant' to null.");
            }
            row.getTable().setString(columnInfo.participantColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'participant' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.participantColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$location() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.locationColKey);
    }

    @Override
    public void realmSet$location(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'location' to null.");
            }
            row.getTable().setString(columnInfo.locationColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'location' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.locationColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tournamentType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tournamentTypeColKey);
    }

    @Override
    public void realmSet$tournamentType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'tournamentType' to null.");
            }
            row.getTable().setString(columnInfo.tournamentTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'tournamentType' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.tournamentTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dateColKey);
    }

    @Override
    public void realmSet$date(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            }
            row.getTable().setString(columnInfo.dateColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.dateColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Tournament", false, 8, 0);
        builder.addPersistedProperty("_id", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("_partition", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("game", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("participant", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("location", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("tournamentType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TournamentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TournamentColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Tournament";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Tournament";
    }

    @SuppressWarnings("cast")
    public static com.mongodb.app.Tournament createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.mongodb.app.Tournament obj = null;
        if (update) {
            Table table = realm.getTable(com.mongodb.app.Tournament.class);
            TournamentColumnInfo columnInfo = (TournamentColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class);
            long pkColumnKey = columnInfo.idColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("id")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("id"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_mongodb_app_TournamentRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_mongodb_app_TournamentRealmProxy) realm.createObjectInternal(com.mongodb.app.Tournament.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_mongodb_app_TournamentRealmProxy) realm.createObjectInternal(com.mongodb.app.Tournament.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_mongodb_app_TournamentRealmProxyInterface objProxy = (com_mongodb_app_TournamentRealmProxyInterface) obj;
        if (json.has("_partition")) {
            if (json.isNull("_partition")) {
                objProxy.realmSet$_partition(null);
            } else {
                objProxy.realmSet$_partition((String) json.getString("_partition"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("game")) {
            if (json.isNull("game")) {
                objProxy.realmSet$game(null);
            } else {
                objProxy.realmSet$game((String) json.getString("game"));
            }
        }
        if (json.has("participant")) {
            if (json.isNull("participant")) {
                objProxy.realmSet$participant(null);
            } else {
                objProxy.realmSet$participant((String) json.getString("participant"));
            }
        }
        if (json.has("location")) {
            if (json.isNull("location")) {
                objProxy.realmSet$location(null);
            } else {
                objProxy.realmSet$location((String) json.getString("location"));
            }
        }
        if (json.has("tournamentType")) {
            if (json.isNull("tournamentType")) {
                objProxy.realmSet$tournamentType(null);
            } else {
                objProxy.realmSet$tournamentType((String) json.getString("tournamentType"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                objProxy.realmSet$date(null);
            } else {
                objProxy.realmSet$date((String) json.getString("date"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.mongodb.app.Tournament createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.mongodb.app.Tournament obj = new com.mongodb.app.Tournament();
        final com_mongodb_app_TournamentRealmProxyInterface objProxy = (com_mongodb_app_TournamentRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("_partition")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$_partition((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$_partition(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("game")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$game((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$game(null);
                }
            } else if (name.equals("participant")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$participant((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$participant(null);
                }
            } else if (name.equals("location")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$location((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$location(null);
                }
            } else if (name.equals("tournamentType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tournamentType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tournamentType(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$date(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_mongodb_app_TournamentRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class), false, Collections.<String>emptyList());
        io.realm.com_mongodb_app_TournamentRealmProxy obj = new io.realm.com_mongodb_app_TournamentRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.mongodb.app.Tournament copyOrUpdate(Realm realm, TournamentColumnInfo columnInfo, com.mongodb.app.Tournament object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.Tournament) cachedRealmObject;
        }

        com.mongodb.app.Tournament realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.mongodb.app.Tournament.class);
            long pkColumnKey = columnInfo.idColKey;
            String value = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$id();
            long objKey = Table.NO_MATCH;
            if (value == null) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, value);
            }
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_mongodb_app_TournamentRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.mongodb.app.Tournament copy(Realm realm, TournamentColumnInfo columnInfo, com.mongodb.app.Tournament newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.mongodb.app.Tournament) cachedRealmObject;
        }

        com_mongodb_app_TournamentRealmProxyInterface unmanagedSource = (com_mongodb_app_TournamentRealmProxyInterface) newObject;

        Table table = realm.getTable(com.mongodb.app.Tournament.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo._partitionColKey, unmanagedSource.realmGet$_partition());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.gameColKey, unmanagedSource.realmGet$game());
        builder.addString(columnInfo.participantColKey, unmanagedSource.realmGet$participant());
        builder.addString(columnInfo.locationColKey, unmanagedSource.realmGet$location());
        builder.addString(columnInfo.tournamentTypeColKey, unmanagedSource.realmGet$tournamentType());
        builder.addString(columnInfo.dateColKey, unmanagedSource.realmGet$date());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_mongodb_app_TournamentRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.mongodb.app.Tournament object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Tournament.class);
        long tableNativePtr = table.getNativePtr();
        TournamentColumnInfo columnInfo = (TournamentColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$id();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$_partition = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$_partition();
        if (realmGet$_partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
        }
        String realmGet$name = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$game = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$game();
        if (realmGet$game != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gameColKey, objKey, realmGet$game, false);
        }
        String realmGet$participant = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$participant();
        if (realmGet$participant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.participantColKey, objKey, realmGet$participant, false);
        }
        String realmGet$location = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$location();
        if (realmGet$location != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.locationColKey, objKey, realmGet$location, false);
        }
        String realmGet$tournamentType = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$tournamentType();
        if (realmGet$tournamentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tournamentTypeColKey, objKey, realmGet$tournamentType, false);
        }
        String realmGet$date = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Tournament.class);
        long tableNativePtr = table.getNativePtr();
        TournamentColumnInfo columnInfo = (TournamentColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.Tournament object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Tournament) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$id();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$_partition = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$_partition();
            if (realmGet$_partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
            }
            String realmGet$name = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$game = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$game();
            if (realmGet$game != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gameColKey, objKey, realmGet$game, false);
            }
            String realmGet$participant = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$participant();
            if (realmGet$participant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.participantColKey, objKey, realmGet$participant, false);
            }
            String realmGet$location = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$location();
            if (realmGet$location != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.locationColKey, objKey, realmGet$location, false);
            }
            String realmGet$tournamentType = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$tournamentType();
            if (realmGet$tournamentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tournamentTypeColKey, objKey, realmGet$tournamentType, false);
            }
            String realmGet$date = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.mongodb.app.Tournament object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.mongodb.app.Tournament.class);
        long tableNativePtr = table.getNativePtr();
        TournamentColumnInfo columnInfo = (TournamentColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class);
        long pkColumnKey = columnInfo.idColKey;
        String primaryKeyValue = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$id();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$_partition = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$_partition();
        if (realmGet$_partition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo._partitionColKey, objKey, false);
        }
        String realmGet$name = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$game = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$game();
        if (realmGet$game != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.gameColKey, objKey, realmGet$game, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.gameColKey, objKey, false);
        }
        String realmGet$participant = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$participant();
        if (realmGet$participant != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.participantColKey, objKey, realmGet$participant, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.participantColKey, objKey, false);
        }
        String realmGet$location = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$location();
        if (realmGet$location != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.locationColKey, objKey, realmGet$location, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.locationColKey, objKey, false);
        }
        String realmGet$tournamentType = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$tournamentType();
        if (realmGet$tournamentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tournamentTypeColKey, objKey, realmGet$tournamentType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tournamentTypeColKey, objKey, false);
        }
        String realmGet$date = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.mongodb.app.Tournament.class);
        long tableNativePtr = table.getNativePtr();
        TournamentColumnInfo columnInfo = (TournamentColumnInfo) realm.getSchema().getColumnInfo(com.mongodb.app.Tournament.class);
        long pkColumnKey = columnInfo.idColKey;
        com.mongodb.app.Tournament object = null;
        while (objects.hasNext()) {
            object = (com.mongodb.app.Tournament) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$id();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$_partition = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$_partition();
            if (realmGet$_partition != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._partitionColKey, objKey, realmGet$_partition, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo._partitionColKey, objKey, false);
            }
            String realmGet$name = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$game = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$game();
            if (realmGet$game != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.gameColKey, objKey, realmGet$game, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.gameColKey, objKey, false);
            }
            String realmGet$participant = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$participant();
            if (realmGet$participant != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.participantColKey, objKey, realmGet$participant, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.participantColKey, objKey, false);
            }
            String realmGet$location = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$location();
            if (realmGet$location != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.locationColKey, objKey, realmGet$location, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.locationColKey, objKey, false);
            }
            String realmGet$tournamentType = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$tournamentType();
            if (realmGet$tournamentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tournamentTypeColKey, objKey, realmGet$tournamentType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tournamentTypeColKey, objKey, false);
            }
            String realmGet$date = ((com_mongodb_app_TournamentRealmProxyInterface) object).realmGet$date();
            if (realmGet$date != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dateColKey, objKey, realmGet$date, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateColKey, objKey, false);
            }
        }
    }

    public static com.mongodb.app.Tournament createDetachedCopy(com.mongodb.app.Tournament realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.mongodb.app.Tournament unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.mongodb.app.Tournament();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.mongodb.app.Tournament) cachedObject.object;
            }
            unmanagedObject = (com.mongodb.app.Tournament) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_mongodb_app_TournamentRealmProxyInterface unmanagedCopy = (com_mongodb_app_TournamentRealmProxyInterface) unmanagedObject;
        com_mongodb_app_TournamentRealmProxyInterface realmSource = (com_mongodb_app_TournamentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$_partition(realmSource.realmGet$_partition());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$game(realmSource.realmGet$game());
        unmanagedCopy.realmSet$participant(realmSource.realmGet$participant());
        unmanagedCopy.realmSet$location(realmSource.realmGet$location());
        unmanagedCopy.realmSet$tournamentType(realmSource.realmGet$tournamentType());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    static com.mongodb.app.Tournament update(Realm realm, TournamentColumnInfo columnInfo, com.mongodb.app.Tournament realmObject, com.mongodb.app.Tournament newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_mongodb_app_TournamentRealmProxyInterface realmObjectTarget = (com_mongodb_app_TournamentRealmProxyInterface) realmObject;
        com_mongodb_app_TournamentRealmProxyInterface realmObjectSource = (com_mongodb_app_TournamentRealmProxyInterface) newObject;
        Table table = realm.getTable(com.mongodb.app.Tournament.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.idColKey, realmObjectSource.realmGet$id());
        builder.addString(columnInfo._partitionColKey, realmObjectSource.realmGet$_partition());
        builder.addString(columnInfo.nameColKey, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.gameColKey, realmObjectSource.realmGet$game());
        builder.addString(columnInfo.participantColKey, realmObjectSource.realmGet$participant());
        builder.addString(columnInfo.locationColKey, realmObjectSource.realmGet$location());
        builder.addString(columnInfo.tournamentTypeColKey, realmObjectSource.realmGet$tournamentType());
        builder.addString(columnInfo.dateColKey, realmObjectSource.realmGet$date());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Tournament = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{_partition:");
        stringBuilder.append(realmGet$_partition());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{game:");
        stringBuilder.append(realmGet$game());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{participant:");
        stringBuilder.append(realmGet$participant());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{location:");
        stringBuilder.append(realmGet$location());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tournamentType:");
        stringBuilder.append(realmGet$tournamentType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_mongodb_app_TournamentRealmProxy aTournament = (com_mongodb_app_TournamentRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTournament.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTournament.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTournament.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
