/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_notic_of_appr_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCNoticeOfAppearance
 * @generated
 */
public class JADSCNoticeOfAppearanceTable
	extends BaseTable<JADSCNoticeOfAppearanceTable> {

	public static final JADSCNoticeOfAppearanceTable INSTANCE =
		new JADSCNoticeOfAppearanceTable();

	public final Column<JADSCNoticeOfAppearanceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Long> jadscNOAId =
		createColumn(
			"jadscNOAId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JADSCNoticeOfAppearanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> fullName =
		createColumn(
			"fullName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> addressOne =
		createColumn(
			"addressOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Date> date = createColumn(
		"date_", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> name =
		createColumn("name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> firm =
		createColumn("firm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCNoticeOfAppearanceTable, Long> jadscApplicationId =
		createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JADSCNoticeOfAppearanceTable() {
		super(
			"nbp_jadsc_notic_of_appr_info", JADSCNoticeOfAppearanceTable::new);
	}

}