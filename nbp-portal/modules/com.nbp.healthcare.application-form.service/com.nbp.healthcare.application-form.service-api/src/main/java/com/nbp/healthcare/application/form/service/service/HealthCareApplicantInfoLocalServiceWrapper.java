/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareApplicantInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantInfoLocalService
 * @generated
 */
public class HealthCareApplicantInfoLocalServiceWrapper
	implements HealthCareApplicantInfoLocalService,
			   ServiceWrapper<HealthCareApplicantInfoLocalService> {

	public HealthCareApplicantInfoLocalServiceWrapper() {
		this(null);
	}

	public HealthCareApplicantInfoLocalServiceWrapper(
		HealthCareApplicantInfoLocalService
			healthCareApplicantInfoLocalService) {

		_healthCareApplicantInfoLocalService =
			healthCareApplicantInfoLocalService;
	}

	/**
	 * Adds the health care applicant info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantInfo the health care applicant info
	 * @return the health care applicant info that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo addHealthCareApplicantInfo(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplicantInfo healthCareApplicantInfo) {

		return _healthCareApplicantInfoLocalService.addHealthCareApplicantInfo(
			healthCareApplicantInfo);
	}

	/**
	 * Creates a new health care applicant info with the primary key. Does not add the health care applicant info to the database.
	 *
	 * @param healthCareApplicantInfoId the primary key for the new health care applicant info
	 * @return the new health care applicant info
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo createHealthCareApplicantInfo(
				long healthCareApplicantInfoId) {

		return _healthCareApplicantInfoLocalService.
			createHealthCareApplicantInfo(healthCareApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care applicant info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantInfo the health care applicant info
	 * @return the health care applicant info that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo deleteHealthCareApplicantInfo(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplicantInfo healthCareApplicantInfo) {

		return _healthCareApplicantInfoLocalService.
			deleteHealthCareApplicantInfo(healthCareApplicantInfo);
	}

	/**
	 * Deletes the health care applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info that was removed
	 * @throws PortalException if a health care applicant info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo deleteHealthCareApplicantInfo(
					long healthCareApplicantInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantInfoLocalService.
			deleteHealthCareApplicantInfo(healthCareApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareApplicantInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareApplicantInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareApplicantInfoLocalService.dynamicQuery();
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

		return _healthCareApplicantInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoModelImpl</code>.
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

		return _healthCareApplicantInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoModelImpl</code>.
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

		return _healthCareApplicantInfoLocalService.dynamicQuery(
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

		return _healthCareApplicantInfoLocalService.dynamicQueryCount(
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

		return _healthCareApplicantInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo fetchHealthCareApplicantInfo(
				long healthCareApplicantInfoId) {

		return _healthCareApplicantInfoLocalService.
			fetchHealthCareApplicantInfo(healthCareApplicantInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareApplicantInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the health care applicant info with the primary key.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info
	 * @throws PortalException if a health care applicant info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo getHealthCareApplicantInfo(
					long healthCareApplicantInfoId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantInfoLocalService.getHealthCareApplicantInfo(
			healthCareApplicantInfoId);
	}

	/**
	 * Returns a range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @return the range of health care applicant infos
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo> getHealthCareApplicantInfos(
				int start, int end) {

		return _healthCareApplicantInfoLocalService.getHealthCareApplicantInfos(
			start, end);
	}

	/**
	 * Returns the number of health care applicant infos.
	 *
	 * @return the number of health care applicant infos
	 */
	@Override
	public int getHealthCareApplicantInfosCount() {
		return _healthCareApplicantInfoLocalService.
			getHealthCareApplicantInfosCount();
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo getHealthCareById(
				long healthCareApplicationId) {

		return _healthCareApplicantInfoLocalService.getHealthCareById(
			healthCareApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareApplicantInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicantInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care applicant info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantInfo the health care applicant info
	 * @return the health care applicant info that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantInfo updateHealthCareApplicantInfo(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplicantInfo healthCareApplicantInfo) {

		return _healthCareApplicantInfoLocalService.
			updateHealthCareApplicantInfo(healthCareApplicantInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareApplicantInfoLocalService.getBasePersistence();
	}

	@Override
	public HealthCareApplicantInfoLocalService getWrappedService() {
		return _healthCareApplicantInfoLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicantInfoLocalService
			healthCareApplicantInfoLocalService) {

		_healthCareApplicantInfoLocalService =
			healthCareApplicantInfoLocalService;
	}

	private HealthCareApplicantInfoLocalService
		_healthCareApplicantInfoLocalService;

}