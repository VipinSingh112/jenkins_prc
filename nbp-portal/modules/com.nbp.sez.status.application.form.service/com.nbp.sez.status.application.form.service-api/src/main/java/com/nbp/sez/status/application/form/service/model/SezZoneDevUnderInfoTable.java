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
 * The table class for the &quot;nbp_sez_zone_dev_under_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfo
 * @generated
 */
public class SezZoneDevUnderInfoTable
	extends BaseTable<SezZoneDevUnderInfoTable> {

	public static final SezZoneDevUnderInfoTable INSTANCE =
		new SezZoneDevUnderInfoTable();

	public final Column<SezZoneDevUnderInfoTable, Long> sezZoneDevUnderInfoId =
		createColumn(
			"sezZoneDevUnderInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneDevUnderInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> developerName =
		createColumn(
			"developerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> approvalLetterNum =
		createColumn(
			"approvalLetterNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Date> approvalLetterDate =
		createColumn(
			"approvalLetterDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> developerAgreeNum =
		createColumn(
			"developerAgreeNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Date> developerAgreeDate =
		createColumn(
			"developerAgreeDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> developerControlNum =
		createColumn(
			"developerControlNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> declarantTitle =
		createColumn(
			"declarantTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> declarantName =
		createColumn(
			"declarantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String>
		declarantTelephoneNum = createColumn(
			"declarantTelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> declarantEmail =
		createColumn(
			"declarantEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Date> signatureDate =
		createColumn(
			"signatureDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, String> publicNotaryName =
		createColumn(
			"publicNotaryName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Date>
		publicNotarySignatureDate = createColumn(
			"publicNotarySignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneDevUnderInfoTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneDevUnderInfoTable() {
		super("nbp_sez_zone_dev_under_info", SezZoneDevUnderInfoTable::new);
	}

}