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
 * The table class for the &quot;nbp_cannabis_cpo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwner
 * @generated
 */
public class CannabisConsentByPropertyOwnerTable
	extends BaseTable<CannabisConsentByPropertyOwnerTable> {

	public static final CannabisConsentByPropertyOwnerTable INSTANCE =
		new CannabisConsentByPropertyOwnerTable();

	public final Column<CannabisConsentByPropertyOwnerTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, Long>
		cannabisCPOId = createColumn(
			"cannabisCPOId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CannabisConsentByPropertyOwnerTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, String>
		typeOfProperty = createColumn(
			"typeOfProperty", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, String>
		descriptionOfProperty = createColumn(
			"descriptionOfProperty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, String>
		descriptionOfIntendedUse = createColumn(
			"descriptionOfIntendedUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, String> landType =
		createColumn(
			"landType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, String>
		ownsProperty = createColumn(
			"ownsProperty", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentByPropertyOwnerTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisConsentByPropertyOwnerTable() {
		super("nbp_cannabis_cpo", CannabisConsentByPropertyOwnerTable::new);
	}

}