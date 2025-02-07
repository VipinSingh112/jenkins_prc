/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_land_employment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandEmployment
 * @generated
 */
public class AcquireLandEmploymentTable
	extends BaseTable<AcquireLandEmploymentTable> {

	public static final AcquireLandEmploymentTable INSTANCE =
		new AcquireLandEmploymentTable();

	public final Column<AcquireLandEmploymentTable, Long>
		acquireLandEmploymentId = createColumn(
			"acquireLandEmploymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireLandEmploymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmploymentStatus = createColumn(
			"landEmploymentStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmpJamaicaGovEmplyee = createColumn(
			"landEmpJamaicaGovEmplyee", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String> landEmpCompanyName =
		createColumn(
			"landEmpCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmploymentJobTitle = createColumn(
			"landEmploymentJobTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String> landEmpCompanyAddr =
		createColumn(
			"landEmpCompanyAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String> landEmpTeleNum =
		createColumn(
			"landEmpTeleNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmpGrossSalaryType = createColumn(
			"landEmpGrossSalaryType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String> landEmpGrossSalary =
		createColumn(
			"landEmpGrossSalary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmpOtherIncomeSource = createColumn(
			"landEmpOtherIncomeSource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmpOtherSalaryType = createColumn(
			"landEmpOtherSalaryType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmpOtherIncomeAmount = createColumn(
			"landEmpOtherIncomeAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, String>
		landEmpFinancialSupportPerson = createColumn(
			"landEmpFinancialSupportPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandEmploymentTable, Long> acquireApplicationId =
		createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquireLandEmploymentTable() {
		super("nbp_acquire_land_employment", AcquireLandEmploymentTable::new);
	}

}