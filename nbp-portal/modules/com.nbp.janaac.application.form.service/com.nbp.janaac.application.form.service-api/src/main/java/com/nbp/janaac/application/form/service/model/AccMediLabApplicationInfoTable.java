/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_medi_app_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfo
 * @generated
 */
public class AccMediLabApplicationInfoTable
	extends BaseTable<AccMediLabApplicationInfoTable> {

	public static final AccMediLabApplicationInfoTable INSTANCE =
		new AccMediLabApplicationInfoTable();

	public final Column<AccMediLabApplicationInfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Long>
		accMediLabApplicationInfoId = createColumn(
			"accMediLabApplicationInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabApplicationInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		nameOfApplicant = createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		applicantAddress = createColumn(
			"applicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		appliTelephoneNo = createColumn(
			"appliTelephoneNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String> appliFaxNo =
		createColumn(
			"appliFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String> appliWebsite =
		createColumn(
			"appliWebsite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String> laboratoryName =
		createColumn(
			"laboratoryName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		laboratoryAddress = createColumn(
			"laboratoryAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String> nameOfIncharge =
		createColumn(
			"nameOfIncharge", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		emailOfIncharge = createColumn(
			"emailOfIncharge", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		personnelQMName = createColumn(
			"personnelQMName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		personnelQMEmail = createColumn(
			"personnelQMEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		deputyInchargeName = createColumn(
			"deputyInchargeName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		deputyInchargeEmail = createColumn(
			"deputyInchargeEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		personnelFMName = createColumn(
			"personnelFMName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		personnelFMEmail = createColumn(
			"personnelFMEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String> accRequestType =
		createColumn(
			"accRequestType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		authorizedPersonnelName = createColumn(
			"authorizedPersonnelName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, String>
		authorizedPosition = createColumn(
			"authorizedPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Date>
		authorizedPersonnelDate = createColumn(
			"authorizedPersonnelDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabApplicationInfoTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabApplicationInfoTable() {
		super(
			"nbp_janaac_acc_medi_app_info",
			AccMediLabApplicationInfoTable::new);
	}

}