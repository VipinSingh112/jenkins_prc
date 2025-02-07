/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_dec_own&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeclarationOfOwnership
 * @generated
 */
public class CannabisDeclarationOfOwnershipTable
	extends BaseTable<CannabisDeclarationOfOwnershipTable> {

	public static final CannabisDeclarationOfOwnershipTable INSTANCE =
		new CannabisDeclarationOfOwnershipTable();

	public final Column<CannabisDeclarationOfOwnershipTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Long>
		cannabisDecOfOwnershipId = createColumn(
			"cannabisDecOfOwnershipId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisDeclarationOfOwnershipTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> firstName =
		createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String>
		middleName = createColumn(
			"middleName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> surname =
		createColumn(
			"surname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String>
		percentOfOwnership = createColumn(
			"percentOfOwnership", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String>
		citizenship = createColumn(
			"citizenship", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Date> dob =
		createColumn("dob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> idNumber =
		createColumn(
			"idNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> typeOfId =
		createColumn(
			"typeOfId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Long>
		officialPoliceRecordDocId = createColumn(
			"officialPoliceRecordDocId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Long>
		certifiedCopyofIdDocId = createColumn(
			"certifiedCopyofIdDocId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, String> signature =
		createColumn(
			"signature", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisDeclarationOfOwnershipTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisDeclarationOfOwnershipTable() {
		super("nbp_cannabis_dec_own", CannabisDeclarationOfOwnershipTable::new);
	}

}