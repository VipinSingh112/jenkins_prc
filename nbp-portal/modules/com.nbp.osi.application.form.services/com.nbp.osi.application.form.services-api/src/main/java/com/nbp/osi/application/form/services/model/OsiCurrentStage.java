/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiCurrentStage service. Represents a row in the &quot;nbp_osi_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.application.form.services.model.impl.OsiCurrentStageImpl"
)
@ProviderType
public interface OsiCurrentStage extends OsiCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.application.form.services.model.impl.OsiCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiCurrentStage, Long>
		OSI_CURRENT_STAGE_ID_ACCESSOR = new Accessor<OsiCurrentStage, Long>() {

			@Override
			public Long get(OsiCurrentStage osiCurrentStage) {
				return osiCurrentStage.getOsiCurrentStageId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OsiCurrentStage> getTypeClass() {
				return OsiCurrentStage.class;
			}

		};

}