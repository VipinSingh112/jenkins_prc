/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OSIServiceCurrentStage service. Represents a row in the &quot;nbp_osi_services_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageImpl"
)
@ProviderType
public interface OSIServiceCurrentStage
	extends OSIServiceCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OSIServiceCurrentStage, Long>
		OSI_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<OSIServiceCurrentStage, Long>() {

				@Override
				public Long get(OSIServiceCurrentStage osiServiceCurrentStage) {
					return osiServiceCurrentStage.getOsiCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OSIServiceCurrentStage> getTypeClass() {
					return OSIServiceCurrentStage.class;
				}

			};

}