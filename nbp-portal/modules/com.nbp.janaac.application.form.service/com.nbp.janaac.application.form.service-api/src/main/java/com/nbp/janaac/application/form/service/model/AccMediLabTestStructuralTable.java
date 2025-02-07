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
 * The table class for the &quot;nbp_janaac_acc_med_test_struct&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestStructural
 * @generated
 */
public class AccMediLabTestStructuralTable
	extends BaseTable<AccMediLabTestStructuralTable> {

	public static final AccMediLabTestStructuralTable INSTANCE =
		new AccMediLabTestStructuralTable();

	public final Column<AccMediLabTestStructuralTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, Long>
		accMediLabTestStructuralId = createColumn(
			"accMediLabTestStructuralId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabTestStructuralTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testLabLegalEntity = createColumn(
			"testLabLegalEntity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String> testlegalStatus =
		createColumn(
			"testlegalStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testlabPartOfOrg = createColumn(
			"testlabPartOfOrg", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testlabPartOfOrgName = createColumn(
			"testlabPartOfOrgName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testLabPartOfOrgPos = createColumn(
			"testLabPartOfOrgPos", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testMangerialStaff = createColumn(
			"testMangerialStaff", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testTechnicalStaff = createColumn(
			"testTechnicalStaff", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String>
		testingRelevantDoc = createColumn(
			"testingRelevantDoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String> testMajorIncome =
		createColumn(
			"testMajorIncome", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, String> testLabClients =
		createColumn(
			"testLabClients", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestStructuralTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabTestStructuralTable() {
		super(
			"nbp_janaac_acc_med_test_struct",
			AccMediLabTestStructuralTable::new);
	}

}