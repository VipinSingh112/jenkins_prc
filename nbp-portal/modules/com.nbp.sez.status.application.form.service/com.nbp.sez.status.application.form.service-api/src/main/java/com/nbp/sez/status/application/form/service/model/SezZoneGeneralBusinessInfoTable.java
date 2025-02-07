/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_zone_gen_business_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBusinessInfo
 * @generated
 */
public class SezZoneGeneralBusinessInfoTable
	extends BaseTable<SezZoneGeneralBusinessInfoTable> {

	public static final SezZoneGeneralBusinessInfoTable INSTANCE =
		new SezZoneGeneralBusinessInfoTable();

	public final Column<SezZoneGeneralBusinessInfoTable, Long>
		sezZoneGeneralBusinessInfoId = createColumn(
			"sezZoneGeneralBusinessInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneGeneralBusinessInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, Date> applicationDate =
		createColumn(
			"applicationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String> developerName =
		createColumn(
			"developerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String> LocationName =
		createColumn(
			"LocationName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String> controlNum =
		createColumn(
			"controlNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String>
		existingCompany = createColumn(
			"existingCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String> articleForm =
		createColumn(
			"articleForm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String>
		otherArticleForm = createColumn(
			"otherArticleForm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String>
		nonResidentCom = createColumn(
			"nonResidentCom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String> taxRegisNum =
		createColumn(
			"taxRegisNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String>
		genConsumptionNum = createColumn(
			"genConsumptionNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, String>
		taxComplianceCertificateNum = createColumn(
			"taxComplianceCertificateNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBusinessInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneGeneralBusinessInfoTable() {
		super(
			"nbp_sez_zone_gen_business_info",
			SezZoneGeneralBusinessInfoTable::new);
	}

}