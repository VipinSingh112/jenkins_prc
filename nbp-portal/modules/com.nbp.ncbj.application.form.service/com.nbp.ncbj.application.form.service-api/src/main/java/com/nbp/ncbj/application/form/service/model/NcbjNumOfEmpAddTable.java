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
 * The table class for the &quot;nbp_ncbj_num_of_emp&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAdd
 * @generated
 */
public class NcbjNumOfEmpAddTable extends BaseTable<NcbjNumOfEmpAddTable> {

	public static final NcbjNumOfEmpAddTable INSTANCE =
		new NcbjNumOfEmpAddTable();

	public final Column<NcbjNumOfEmpAddTable, Long> ncbjNumOfEmpAddId =
		createColumn(
			"ncbjNumOfEmpAddId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjNumOfEmpAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> headOffice = createColumn(
		"headOffice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> administrationOffice =
		createColumn(
			"administrationOffice", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> productionProcessing =
		createColumn(
			"productionProcessing", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> maintenanceService =
		createColumn(
			"maintenanceService", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> logistics = createColumn(
		"logistics", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> total = createColumn(
		"total", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> seasonal = createColumn(
		"seasonal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> temporary = createColumn(
		"temporary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> subcontracted =
		createColumn(
			"subcontracted", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumOfEmpAddTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjNumOfEmpAddTable() {
		super("nbp_ncbj_num_of_emp", NcbjNumOfEmpAddTable::new);
	}

}