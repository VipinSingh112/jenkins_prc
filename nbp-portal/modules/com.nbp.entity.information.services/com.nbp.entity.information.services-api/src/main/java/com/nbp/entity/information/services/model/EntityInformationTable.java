/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_entity_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformation
 * @generated
 */
public class EntityInformationTable extends BaseTable<EntityInformationTable> {

	public static final EntityInformationTable INSTANCE =
		new EntityInformationTable();

	public final Column<EntityInformationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, Long> entityInfoId =
		createColumn(
			"entityInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EntityInformationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> entityName =
		createColumn(
			"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> entityAddressOne =
		createColumn(
			"entityAddressOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> entityAddressTwo =
		createColumn(
			"entityAddressTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> mailingAdd =
		createColumn(
			"mailingAdd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> permanentAdd =
		createColumn(
			"permanentAdd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> fax = createColumn(
		"fax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> website = createColumn(
		"website", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> postalCode =
		createColumn(
			"postalCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> parish = createColumn(
		"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> officeEmail =
		createColumn(
			"officeEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> country = createColumn(
		"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, Date> incorporationDate =
		createColumn(
			"incorporationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> incorporationPlace =
		createColumn(
			"incorporationPlace", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> isUserPrimaryUser =
		createColumn(
			"isUserPrimaryUser", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> entityNumber =
		createColumn(
			"entityNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> userType = createColumn(
		"userType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntityInformationTable, String> trn = createColumn(
		"trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EntityInformationTable() {
		super("nbp_entity_info", EntityInformationTable::new);
	}

}