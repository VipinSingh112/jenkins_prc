/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireCurrentStageLocalService
 * @generated
 */
public class AcquireCurrentStageLocalServiceWrapper
	implements AcquireCurrentStageLocalService,
			   ServiceWrapper<AcquireCurrentStageLocalService> {

	public AcquireCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public AcquireCurrentStageLocalServiceWrapper(
		AcquireCurrentStageLocalService acquireCurrentStageLocalService) {

		_acquireCurrentStageLocalService = acquireCurrentStageLocalService;
	}

	/**
	 * Adds the acquire current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireCurrentStage the acquire current stage
	 * @return the acquire current stage that was added
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
		addAcquireCurrentStage(
			com.nbp.acquire.application.form.service.model.AcquireCurrentStage
				acquireCurrentStage) {

		return _acquireCurrentStageLocalService.addAcquireCurrentStage(
			acquireCurrentStage);
	}

	/**
	 * Creates a new acquire current stage with the primary key. Does not add the acquire current stage to the database.
	 *
	 * @param acquireCurrentStageId the primary key for the new acquire current stage
	 * @return the new acquire current stage
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
		createAcquireCurrentStage(long acquireCurrentStageId) {

		return _acquireCurrentStageLocalService.createAcquireCurrentStage(
			acquireCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireCurrentStage the acquire current stage
	 * @return the acquire current stage that was removed
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
		deleteAcquireCurrentStage(
			com.nbp.acquire.application.form.service.model.AcquireCurrentStage
				acquireCurrentStage) {

		return _acquireCurrentStageLocalService.deleteAcquireCurrentStage(
			acquireCurrentStage);
	}

	/**
	 * Deletes the acquire current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage that was removed
	 * @throws PortalException if a acquire current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
			deleteAcquireCurrentStage(long acquireCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireCurrentStageLocalService.deleteAcquireCurrentStage(
			acquireCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireCurrentStageLocalService.dynamicQuery();
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

		return _acquireCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireCurrentStageModelImpl</code>.
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

		return _acquireCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireCurrentStageModelImpl</code>.
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

		return _acquireCurrentStageLocalService.dynamicQuery(
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

		return _acquireCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
		fetchAcquireCurrentStage(long acquireCurrentStageId) {

		return _acquireCurrentStageLocalService.fetchAcquireCurrentStage(
			acquireCurrentStageId);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
			getAcquireById(long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireCurrentStageException {

		return _acquireCurrentStageLocalService.getAcquireById(
			acquireApplicationId);
	}

	/**
	 * Returns the acquire current stage with the primary key.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage
	 * @throws PortalException if a acquire current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
			getAcquireCurrentStage(long acquireCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireCurrentStageLocalService.getAcquireCurrentStage(
			acquireCurrentStageId);
	}

	/**
	 * Returns a range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @return the range of acquire current stages
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireCurrentStage>
			getAcquireCurrentStages(int start, int end) {

		return _acquireCurrentStageLocalService.getAcquireCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of acquire current stages.
	 *
	 * @return the number of acquire current stages
	 */
	@Override
	public int getAcquireCurrentStagesCount() {
		return _acquireCurrentStageLocalService.getAcquireCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireCurrentStage the acquire current stage
	 * @return the acquire current stage that was updated
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireCurrentStage
		updateAcquireCurrentStage(
			com.nbp.acquire.application.form.service.model.AcquireCurrentStage
				acquireCurrentStage) {

		return _acquireCurrentStageLocalService.updateAcquireCurrentStage(
			acquireCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public AcquireCurrentStageLocalService getWrappedService() {
		return _acquireCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireCurrentStageLocalService acquireCurrentStageLocalService) {

		_acquireCurrentStageLocalService = acquireCurrentStageLocalService;
	}

	private AcquireCurrentStageLocalService _acquireCurrentStageLocalService;

}