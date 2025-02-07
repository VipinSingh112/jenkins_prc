/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HsraApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationCurrentStageLocalService
 * @generated
 */
public class HsraApplicationCurrentStageLocalServiceWrapper
	implements HsraApplicationCurrentStageLocalService,
			   ServiceWrapper<HsraApplicationCurrentStageLocalService> {

	public HsraApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public HsraApplicationCurrentStageLocalServiceWrapper(
		HsraApplicationCurrentStageLocalService
			hsraApplicationCurrentStageLocalService) {

		_hsraApplicationCurrentStageLocalService =
			hsraApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the hsra application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationCurrentStage the hsra application current stage
	 * @return the hsra application current stage that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
		addHsraApplicationCurrentStage(
			com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
				hsraApplicationCurrentStage) {

		return _hsraApplicationCurrentStageLocalService.
			addHsraApplicationCurrentStage(hsraApplicationCurrentStage);
	}

	/**
	 * Creates a new hsra application current stage with the primary key. Does not add the hsra application current stage to the database.
	 *
	 * @param hsraApplicationCurrentStageId the primary key for the new hsra application current stage
	 * @return the new hsra application current stage
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
		createHsraApplicationCurrentStage(long hsraApplicationCurrentStageId) {

		return _hsraApplicationCurrentStageLocalService.
			createHsraApplicationCurrentStage(hsraApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the hsra application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationCurrentStage the hsra application current stage
	 * @return the hsra application current stage that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
		deleteHsraApplicationCurrentStage(
			com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
				hsraApplicationCurrentStage) {

		return _hsraApplicationCurrentStageLocalService.
			deleteHsraApplicationCurrentStage(hsraApplicationCurrentStage);
	}

	/**
	 * Deletes the hsra application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage that was removed
	 * @throws PortalException if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
			deleteHsraApplicationCurrentStage(
				long hsraApplicationCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationCurrentStageLocalService.
			deleteHsraApplicationCurrentStage(hsraApplicationCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationCurrentStageLocalService.dynamicQuery();
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

		return _hsraApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationCurrentStageModelImpl</code>.
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

		return _hsraApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationCurrentStageModelImpl</code>.
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

		return _hsraApplicationCurrentStageLocalService.dynamicQuery(
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

		return _hsraApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _hsraApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
		fetchHsraApplicationCurrentStage(long hsraApplicationCurrentStageId) {

		return _hsraApplicationCurrentStageLocalService.
			fetchHsraApplicationCurrentStage(hsraApplicationCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
			getHsra_Stage_HAI(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationCurrentStageException {

		return _hsraApplicationCurrentStageLocalService.getHsra_Stage_HAI(
			hsraApplicationId);
	}

	/**
	 * Returns the hsra application current stage with the primary key.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage
	 * @throws PortalException if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
			getHsraApplicationCurrentStage(long hsraApplicationCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationCurrentStageLocalService.
			getHsraApplicationCurrentStage(hsraApplicationCurrentStageId);
	}

	/**
	 * Returns a range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @return the range of hsra application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplicationCurrentStage>
			getHsraApplicationCurrentStages(int start, int end) {

		return _hsraApplicationCurrentStageLocalService.
			getHsraApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of hsra application current stages.
	 *
	 * @return the number of hsra application current stages
	 */
	@Override
	public int getHsraApplicationCurrentStagesCount() {
		return _hsraApplicationCurrentStageLocalService.
			getHsraApplicationCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the hsra application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationCurrentStage the hsra application current stage
	 * @return the hsra application current stage that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
		updateHsraApplicationCurrentStage(
			com.nbp.hsra.application.service.model.HsraApplicationCurrentStage
				hsraApplicationCurrentStage) {

		return _hsraApplicationCurrentStageLocalService.
			updateHsraApplicationCurrentStage(hsraApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public HsraApplicationCurrentStageLocalService getWrappedService() {
		return _hsraApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationCurrentStageLocalService
			hsraApplicationCurrentStageLocalService) {

		_hsraApplicationCurrentStageLocalService =
			hsraApplicationCurrentStageLocalService;
	}

	private HsraApplicationCurrentStageLocalService
		_hsraApplicationCurrentStageLocalService;

}