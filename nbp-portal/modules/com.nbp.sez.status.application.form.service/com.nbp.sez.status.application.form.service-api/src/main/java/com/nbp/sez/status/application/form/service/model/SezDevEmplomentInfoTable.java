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
 * The table class for the &quot;nbp_sez_dev_emploment_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmplomentInfo
 * @generated
 */
public class SezDevEmplomentInfoTable
	extends BaseTable<SezDevEmplomentInfoTable> {

	public static final SezDevEmplomentInfoTable INSTANCE =
		new SezDevEmplomentInfoTable();

	public final Column<SezDevEmplomentInfoTable, Long> sezDevEmplomentInfoId =
		createColumn(
			"sezDevEmplomentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevEmplomentInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> firstYearDirect =
		createColumn(
			"firstYearDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> firstYearInDirect =
		createColumn(
			"firstYearInDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> firstYearMale =
		createColumn(
			"firstYearMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> firstYearFemale =
		createColumn(
			"firstYearFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> firstYearLocal =
		createColumn(
			"firstYearLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> firstYearForeign =
		createColumn(
			"firstYearForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> secondYearDirect =
		createColumn(
			"secondYearDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> secondYearIndirect =
		createColumn(
			"secondYearIndirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> secondYearMale =
		createColumn(
			"secondYearMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> secondYearFemale =
		createColumn(
			"secondYearFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> secondYearLocal =
		createColumn(
			"secondYearLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> secondYearForeign =
		createColumn(
			"secondYearForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> thirdYearDirect =
		createColumn(
			"thirdYearDirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> thirdYearIndirect =
		createColumn(
			"thirdYearIndirect", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> thirdYearMale =
		createColumn(
			"thirdYearMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> thirdYearFemale =
		createColumn(
			"thirdYearFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> thirdYearLocal =
		createColumn(
			"thirdYearLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, String> thirdYearForeign =
		createColumn(
			"thirdYearForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevEmplomentInfoTable, Long> sezStatusApplicationId =
		createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevEmplomentInfoTable() {
		super("nbp_sez_dev_emploment_info", SezDevEmplomentInfoTable::new);
	}

}