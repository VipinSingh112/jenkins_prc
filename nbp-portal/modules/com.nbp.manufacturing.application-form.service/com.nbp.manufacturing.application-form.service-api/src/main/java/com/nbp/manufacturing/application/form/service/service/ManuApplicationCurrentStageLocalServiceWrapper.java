/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuApplicationCurrentStageLocalService
 * @generated
 */
public class ManuApplicationCurrentStageLocalServiceWrapper
	implements ManuApplicationCurrentStageLocalService,
			   ServiceWrapper<ManuApplicationCurrentStageLocalService> {

	public ManuApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public ManuApplicationCurrentStageLocalServiceWrapper(
		ManuApplicationCurrentStageLocalService
			manuApplicationCurrentStageLocalService) {

		_manuApplicationCurrentStageLocalService =
			manuApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the manu application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 * @return the manu application current stage that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage addManuApplicationCurrentStage(
			com.nbp.manufacturing.application.form.service.model.
				ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return _manuApplicationCurrentStageLocalService.
			addManuApplicationCurrentStage(manuApplicationCurrentStage);
	}

	/**
	 * Creates a new manu application current stage with the primary key. Does not add the manu application current stage to the database.
	 *
	 * @param manuApplicationCuurentStageId the primary key for the new manu application current stage
	 * @return the new manu application current stage
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage createManuApplicationCurrentStage(
			long manuApplicationCuurentStageId) {

		return _manuApplicationCurrentStageLocalService.
			createManuApplicationCurrentStage(manuApplicationCuurentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage that was removed
	 * @throws PortalException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage deleteManuApplicationCurrentStage(
				long manuApplicationCuurentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuApplicationCurrentStageLocalService.
			deleteManuApplicationCurrentStage(manuApplicationCuurentStageId);
	}

	/**
	 * Deletes the manu application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 * @return the manu application current stage that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage deleteManuApplicationCurrentStage(
			com.nbp.manufacturing.application.form.service.model.
				ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return _manuApplicationCurrentStageLocalService.
			deleteManuApplicationCurrentStage(manuApplicationCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuApplicationCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuApplicationCurrentStageLocalService.dynamicQuery();
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

		return _manuApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl</code>.
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

		return _manuApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl</code>.
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

		return _manuApplicationCurrentStageLocalService.dynamicQuery(
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

		return _manuApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _manuApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage fetchManuApplicationCurrentStage(
			long manuApplicationCuurentStageId) {

		return _manuApplicationCurrentStageLocalService.
			fetchManuApplicationCurrentStage(manuApplicationCuurentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuApplicationCurrentStage> getMA_CS_MAI(long applicationId)
				throws com.nbp.manufacturing.application.form.service.exception.
					NoSuchManuApplicationCurrentStageException {

		return _manuApplicationCurrentStageLocalService.getMA_CS_MAI(
			applicationId);
	}

	/**
	 * Returns the manu application current stage with the primary key.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage
	 * @throws PortalException if a manu application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage getManuApplicationCurrentStage(
				long manuApplicationCuurentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuApplicationCurrentStageLocalService.
			getManuApplicationCurrentStage(manuApplicationCuurentStageId);
	}

	/**
	 * Returns a range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of manu application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuApplicationCurrentStage> getManuApplicationCurrentStages(
				int start, int end) {

		return _manuApplicationCurrentStageLocalService.
			getManuApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of manu application current stages.
	 *
	 * @return the number of manu application current stages
	 */
	@Override
	public int getManuApplicationCurrentStagesCount() {
		return _manuApplicationCurrentStageLocalService.
			getManuApplicationCurrentStagesCount();
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage getManufactureById(long applicationId)
			throws com.nbp.manufacturing.application.form.service.exception.
				NoSuchManuApplicationCurrentStageException {

		return _manuApplicationCurrentStageLocalService.getManufactureById(
			applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manu application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 * @return the manu application current stage that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuApplicationCurrentStage updateManuApplicationCurrentStage(
			com.nbp.manufacturing.application.form.service.model.
				ManuApplicationCurrentStage manuApplicationCurrentStage) {

		return _manuApplicationCurrentStageLocalService.
			updateManuApplicationCurrentStage(manuApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuApplicationCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public ManuApplicationCurrentStageLocalService getWrappedService() {
		return _manuApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		ManuApplicationCurrentStageLocalService
			manuApplicationCurrentStageLocalService) {

		_manuApplicationCurrentStageLocalService =
			manuApplicationCurrentStageLocalService;
	}

	private ManuApplicationCurrentStageLocalService
		_manuApplicationCurrentStageLocalService;

}