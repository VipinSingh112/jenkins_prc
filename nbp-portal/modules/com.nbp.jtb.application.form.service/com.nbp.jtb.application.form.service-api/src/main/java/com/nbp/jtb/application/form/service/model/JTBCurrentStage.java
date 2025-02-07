/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JTBCurrentStage service. Represents a row in the &quot;nbp_jtb_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageImpl"
)
@ProviderType
public interface JTBCurrentStage extends JTBCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JTBCurrentStage, Long>
		J_TB_CURRENT_STAGE_ID_ACCESSOR = new Accessor<JTBCurrentStage, Long>() {

			@Override
			public Long get(JTBCurrentStage jtbCurrentStage) {
				return jtbCurrentStage.getJTBCurrentStageId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JTBCurrentStage> getTypeClass() {
				return JTBCurrentStage.class;
			}

		};

}