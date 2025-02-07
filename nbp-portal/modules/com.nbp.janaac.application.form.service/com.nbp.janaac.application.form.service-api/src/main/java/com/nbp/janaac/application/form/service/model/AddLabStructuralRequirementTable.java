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
 * The table class for the &quot;nbp_janaac_add_lab_stru_req&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabStructuralRequirement
 * @generated
 */
public class AddLabStructuralRequirementTable
	extends BaseTable<AddLabStructuralRequirementTable> {

	public static final AddLabStructuralRequirementTable INSTANCE =
		new AddLabStructuralRequirementTable();

	public final Column<AddLabStructuralRequirementTable, Long>
		addLabStructuralRequirementId = createColumn(
			"addLabStructuralRequirementId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddLabStructuralRequirementTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, String> nameOfStaff =
		createColumn(
			"nameOfStaff", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, String> jobTitle =
		createColumn(
			"jobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, String>
		majorResponsibilities = createColumn(
			"majorResponsibilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, String>
		indicateAnalysts = createColumn(
			"indicateAnalysts ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddLabStructuralRequirementTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddLabStructuralRequirementTable() {
		super(
			"nbp_janaac_add_lab_stru_req",
			AddLabStructuralRequirementTable::new);
	}

}