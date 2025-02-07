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
 * The table class for the &quot;nbp_janaac_acc_ins_body_phys&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResource
 * @generated
 */
public class AccInsBodiesPhyResourceTable
	extends BaseTable<AccInsBodiesPhyResourceTable> {

	public static final AccInsBodiesPhyResourceTable INSTANCE =
		new AccInsBodiesPhyResourceTable();

	public final Column<AccInsBodiesPhyResourceTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, Long>
		accInsBodiesPhyResourceId = createColumn(
			"accInsBodiesPhyResourceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccInsBodiesPhyResourceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, String>
		insBodiesfacilities = createColumn(
			"insBodiesfacilities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, String>
		insSafetyFeatures = createColumn(
			"insSafetyFeatures", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, String>
		insSecurityArrangements = createColumn(
			"insSecurityArrangements", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesPhyResourceTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccInsBodiesPhyResourceTable() {
		super(
			"nbp_janaac_acc_ins_body_phys", AccInsBodiesPhyResourceTable::new);
	}

}