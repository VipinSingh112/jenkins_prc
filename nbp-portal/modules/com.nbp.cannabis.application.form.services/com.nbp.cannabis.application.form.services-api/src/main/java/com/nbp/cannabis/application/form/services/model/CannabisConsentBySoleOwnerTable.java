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
 * The table class for the &quot;nbp_cannabis_cso&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwner
 * @generated
 */
public class CannabisConsentBySoleOwnerTable
	extends BaseTable<CannabisConsentBySoleOwnerTable> {

	public static final CannabisConsentBySoleOwnerTable INSTANCE =
		new CannabisConsentBySoleOwnerTable();

	public final Column<CannabisConsentBySoleOwnerTable, Long>
		cannabisConsentBySoleOwnerId = createColumn(
			"cannabisConsentBySoleOwnerId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisConsentBySoleOwnerTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, String> ownerName =
		createColumn(
			"ownerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, Date> date =
		createColumn("date_", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, String> ownerPhone =
		createColumn(
			"ownerPhone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, String> ownerAddress =
		createColumn(
			"ownerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConsentBySoleOwnerTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisConsentBySoleOwnerTable() {
		super("nbp_cannabis_cso", CannabisConsentBySoleOwnerTable::new);
	}

}