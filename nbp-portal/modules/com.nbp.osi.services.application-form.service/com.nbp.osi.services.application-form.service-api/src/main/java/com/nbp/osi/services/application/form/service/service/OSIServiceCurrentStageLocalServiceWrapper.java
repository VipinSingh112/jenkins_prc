/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OSIServiceCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStageLocalService
 * @generated
 */
public class OSIServiceCurrentStageLocalServiceWrapper
	implements OSIServiceCurrentStageLocalService,
			   ServiceWrapper<OSIServiceCurrentStageLocalService> {

	public OSIServiceCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public OSIServiceCurrentStageLocalServiceWrapper(
		OSIServiceCurrentStageLocalService osiServiceCurrentStageLocalService) {

		_osiServiceCurrentStageLocalService =
			osiServiceCurrentStageLocalService;
	}

	/**
	 * Adds the osi service current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 * @return the osi service current stage that was added
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage addOSIServiceCurrentStage(
				com.nbp.osi.services.application.form.service.model.
					OSIServiceCurrentStage osiServiceCurrentStage) {

		return _osiServiceCurrentStageLocalService.addOSIServiceCurrentStage(
			osiServiceCurrentStage);
	}

	/**
	 * Creates a new osi service current stage with the primary key. Does not add the osi service current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi service current stage
	 * @return the new osi service current stage
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage createOSIServiceCurrentStage(
				long osiCurrentStageId) {

		return _osiServiceCurrentStageLocalService.createOSIServiceCurrentStage(
			osiCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi service current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage that was removed
	 * @throws PortalException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage deleteOSIServiceCurrentStage(
					long osiCurrentStageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceCurrentStageLocalService.deleteOSIServiceCurrentStage(
			osiCurrentStageId);
	}

	/**
	 * Deletes the osi service current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 * @return the osi service current stage that was removed
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage deleteOSIServiceCurrentStage(
				com.nbp.osi.services.application.form.service.model.
					OSIServiceCurrentStage osiServiceCurrentStage) {

		return _osiServiceCurrentStageLocalService.deleteOSIServiceCurrentStage(
			osiServiceCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServiceCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServiceCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServiceCurrentStageLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiServiceCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _osiServiceCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _osiServiceCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiServiceCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _osiServiceCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage fetchOSIServiceCurrentStage(
				long osiCurrentStageId) {

		return _osiServiceCurrentStageLocalService.fetchOSIServiceCurrentStage(
			osiCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServiceCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServiceCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage getOsiServiceCS_By_CI(long applicationId)
				throws com.nbp.osi.services.application.form.service.exception.
					NoSuchOSIServiceCurrentStageException {

		return _osiServiceCurrentStageLocalService.getOsiServiceCS_By_CI(
			applicationId);
	}

	/**
	 * Returns the osi service current stage with the primary key.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage
	 * @throws PortalException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage getOSIServiceCurrentStage(
					long osiCurrentStageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceCurrentStageLocalService.getOSIServiceCurrentStage(
			osiCurrentStageId);
	}

	/**
	 * Returns a range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of osi service current stages
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage> getOSIServiceCurrentStages(
				int start, int end) {

		return _osiServiceCurrentStageLocalService.getOSIServiceCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of osi service current stages.
	 *
	 * @return the number of osi service current stages
	 */
	@Override
	public int getOSIServiceCurrentStagesCount() {
		return _osiServiceCurrentStageLocalService.
			getOSIServiceCurrentStagesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi service current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 * @return the osi service current stage that was updated
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OSIServiceCurrentStage updateOSIServiceCurrentStage(
				com.nbp.osi.services.application.form.service.model.
					OSIServiceCurrentStage osiServiceCurrentStage) {

		return _osiServiceCurrentStageLocalService.updateOSIServiceCurrentStage(
			osiServiceCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServiceCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public OSIServiceCurrentStageLocalService getWrappedService() {
		return _osiServiceCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		OSIServiceCurrentStageLocalService osiServiceCurrentStageLocalService) {

		_osiServiceCurrentStageLocalService =
			osiServiceCurrentStageLocalService;
	}

	private OSIServiceCurrentStageLocalService
		_osiServiceCurrentStageLocalService;

}