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
 * The table class for the &quot;nbp_ncbj_number_effective_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumberEffectiveAdd
 * @generated
 */
public class NcbjNumberEffectiveAddTable
	extends BaseTable<NcbjNumberEffectiveAddTable> {

	public static final NcbjNumberEffectiveAddTable INSTANCE =
		new NcbjNumberEffectiveAddTable();

	public final Column<NcbjNumberEffectiveAddTable, Long>
		ncbjNumberEffectiveAddId = createColumn(
			"ncbjNumberEffectiveAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjNumberEffectiveAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String>
		numberOfFullTimeEmployees = createColumn(
			"numberOfFullTimeEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String>
		numberOfPartTimeEmployees = createColumn(
			"numberOfPartTimeEmployees", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String> department =
		createColumn(
			"department", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String>
		numberOfcontractors = createColumn(
			"numberOfcontractors", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String>
		numberOfContractedWorkers = createColumn(
			"numberOfContractedWorkers", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjNumberEffectiveAddTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjNumberEffectiveAddTable() {
		super(
			"nbp_ncbj_number_effective_add", NcbjNumberEffectiveAddTable::new);
	}

}