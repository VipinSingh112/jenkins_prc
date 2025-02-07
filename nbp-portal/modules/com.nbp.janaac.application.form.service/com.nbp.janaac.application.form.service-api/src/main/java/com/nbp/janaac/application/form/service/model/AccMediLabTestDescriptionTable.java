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
 * The table class for the &quot;nbp_janaac_acc_med_test_desc&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescription
 * @generated
 */
public class AccMediLabTestDescriptionTable
	extends BaseTable<AccMediLabTestDescriptionTable> {

	public static final AccMediLabTestDescriptionTable INSTANCE =
		new AccMediLabTestDescriptionTable();

	public final Column<AccMediLabTestDescriptionTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, Long>
		accMediLabTestDescriptionId = createColumn(
			"accMediLabTestDescriptionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabTestDescriptionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, String>
		testClinicalActivity = createColumn(
			"testClinicalActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, String>
		testLabShiftWork = createColumn(
			"testLabShiftWork", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, String>
		testLabSpecimenNo = createColumn(
			"testLabSpecimenNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, String>
		testSpecimenLocation = createColumn(
			"testSpecimenLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestDescriptionTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabTestDescriptionTable() {
		super(
			"nbp_janaac_acc_med_test_desc",
			AccMediLabTestDescriptionTable::new);
	}

}