/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OGTAppCurrentStage service. Represents a row in the &quot;nbp_ogt_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OGTAppCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageImpl"
)
@ProviderType
public interface OGTAppCurrentStage
	extends OGTAppCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ogt.application.form.services.model.impl.OGTAppCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OGTAppCurrentStage, Long>
		OGT_APP_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<OGTAppCurrentStage, Long>() {

				@Override
				public Long get(OGTAppCurrentStage ogtAppCurrentStage) {
					return ogtAppCurrentStage.getOgtAppCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OGTAppCurrentStage> getTypeClass() {
					return OGTAppCurrentStage.class;
				}

			};

}