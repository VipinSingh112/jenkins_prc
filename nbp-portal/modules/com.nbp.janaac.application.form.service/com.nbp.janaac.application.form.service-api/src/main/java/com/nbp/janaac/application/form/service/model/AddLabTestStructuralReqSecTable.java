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
 * The table class for the &quot;nbp_janaac_add_lab_testStr_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabTestStructuralReqSec
 * @generated
 */
public class AddLabTestStructuralReqSecTable
	extends BaseTable<AddLabTestStructuralReqSecTable> {

	public static final AddLabTestStructuralReqSecTable INSTANCE =
		new AddLabTestStructuralReqSecTable();

	public final Column<AddLabTestStructuralReqSecTable, Long>
		addLabTestStructuralReqSecId = createColumn(
			"addLabTestStructuralReqSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabTestStructuralReqSecTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String>
		productMaterial = createColumn(
			"productMaterial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String> tests =
		createColumn("tests", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String> method =
		createColumn(
			"method", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String> equipment =
		createColumn(
			"equipment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String>
		listOfCapability = createColumn(
			"listOfCapability", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String>
		estimateOfMeasurement = createColumn(
			"estimateOfMeasurement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabTestStructuralReqSecTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabTestStructuralReqSecTable() {
		super(
			"nbp_janaac_add_lab_testStr_sec",
			AddLabTestStructuralReqSecTable::new);
	}

}