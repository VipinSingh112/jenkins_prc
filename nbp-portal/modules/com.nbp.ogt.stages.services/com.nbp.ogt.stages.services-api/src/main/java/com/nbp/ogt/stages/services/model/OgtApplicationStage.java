/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OgtApplicationStage service. Represents a row in the &quot;nbp_ogt_application_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ogt.stages.services.model.impl.OgtApplicationStageImpl"
)
@ProviderType
public interface OgtApplicationStage
	extends OgtApplicationStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OgtApplicationStage, Long>
		OGT_STAGES_ID_ACCESSOR = new Accessor<OgtApplicationStage, Long>() {

			@Override
			public Long get(OgtApplicationStage ogtApplicationStage) {
				return ogtApplicationStage.getOgtStagesId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OgtApplicationStage> getTypeClass() {
				return OgtApplicationStage.class;
			}

		};

}