/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_additional_loc&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSite
 * @generated
 */
public class NcbjAddLocMultiSiteTable
	extends BaseTable<NcbjAddLocMultiSiteTable> {

	public static final NcbjAddLocMultiSiteTable INSTANCE =
		new NcbjAddLocMultiSiteTable();

	public final Column<NcbjAddLocMultiSiteTable, Long> ncbjAddLocMultiSiteId =
		createColumn(
			"ncbjAddLocMultiSiteId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjAddLocMultiSiteTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> signatureName =
		createColumn(
			"signatureName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> centralOfficeLink =
		createColumn(
			"centralOfficeLink", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String>
		commonManagementSystem = createColumn(
			"commonManagementSystem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String>
		substantiallySameProcess = createColumn(
			"substantiallySameProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> siteSimilarMethod =
		createColumn(
			"siteSimilarMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> siteUnderAudit =
		createColumn(
			"siteUnderAudit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> siteCorrectiveRight =
		createColumn(
			"siteCorrectiveRight", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> changesAuthority =
		createColumn(
			"changesAuthority", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, Date> date = createColumn(
		"date_", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAddLocMultiSiteTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjAddLocMultiSiteTable() {
		super("nbp_ncbj_additional_loc", NcbjAddLocMultiSiteTable::new);
	}

}