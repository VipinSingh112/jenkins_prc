/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_mining_current_stage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppCurrentStage
 * @generated
 */
public class MiningAppCurrentStageTable
	extends BaseTable<MiningAppCurrentStageTable> {

	public static final MiningAppCurrentStageTable INSTANCE =
		new MiningAppCurrentStageTable();

	public final Column<MiningAppCurrentStageTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, Long>
		miningAppCurrentStageId = createColumn(
			"miningAppCurrentStageId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiningAppCurrentStageTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, String> currentStage =
		createColumn(
			"currentStage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, String> lastFormStep =
		createColumn(
			"lastFormStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningAppCurrentStageTable, Long>
		miningLeaseApplicationId = createColumn(
			"miningLeaseApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningAppCurrentStageTable() {
		super("nbp_mining_current_stage", MiningAppCurrentStageTable::new);
	}

}