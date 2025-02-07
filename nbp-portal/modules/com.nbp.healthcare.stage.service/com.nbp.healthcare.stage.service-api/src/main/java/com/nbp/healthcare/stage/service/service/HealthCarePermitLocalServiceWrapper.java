/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCarePermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermitLocalService
 * @generated
 */
public class HealthCarePermitLocalServiceWrapper
	implements HealthCarePermitLocalService,
			   ServiceWrapper<HealthCarePermitLocalService> {

	public HealthCarePermitLocalServiceWrapper() {
		this(null);
	}

	public HealthCarePermitLocalServiceWrapper(
		HealthCarePermitLocalService healthCarePermitLocalService) {

		_healthCarePermitLocalService = healthCarePermitLocalService;
	}

	/**
	 * Adds the health care permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCarePermit the health care permit
	 * @return the health care permit that was added
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
		addHealthCarePermit(
			com.nbp.healthcare.stage.service.model.HealthCarePermit
				healthCarePermit) {

		return _healthCarePermitLocalService.addHealthCarePermit(
			healthCarePermit);
	}

	/**
	 * Creates a new health care permit with the primary key. Does not add the health care permit to the database.
	 *
	 * @param healthPermitId the primary key for the new health care permit
	 * @return the new health care permit
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
		createHealthCarePermit(long healthPermitId) {

		return _healthCarePermitLocalService.createHealthCarePermit(
			healthPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCarePermitLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCarePermit the health care permit
	 * @return the health care permit that was removed
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
		deleteHealthCarePermit(
			com.nbp.healthcare.stage.service.model.HealthCarePermit
				healthCarePermit) {

		return _healthCarePermitLocalService.deleteHealthCarePermit(
			healthCarePermit);
	}

	/**
	 * Deletes the health care permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit that was removed
	 * @throws PortalException if a health care permit with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
			deleteHealthCarePermit(long healthPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCarePermitLocalService.deleteHealthCarePermit(
			healthPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCarePermitLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCarePermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCarePermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCarePermitLocalService.dynamicQuery();
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

		return _healthCarePermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl</code>.
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

		return _healthCarePermitLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl</code>.
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

		return _healthCarePermitLocalService.dynamicQuery(
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

		return _healthCarePermitLocalService.dynamicQueryCount(dynamicQuery);
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

		return _healthCarePermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
		fetchHealthCarePermit(long healthPermitId) {

		return _healthCarePermitLocalService.fetchHealthCarePermit(
			healthPermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCarePermitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
			getHealthCareBy_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCarePermitException {

		return _healthCarePermitLocalService.getHealthCareBy_CI(caseId);
	}

	/**
	 * Returns the health care permit with the primary key.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit
	 * @throws PortalException if a health care permit with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
			getHealthCarePermit(long healthPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCarePermitLocalService.getHealthCarePermit(
			healthPermitId);
	}

	/**
	 * Returns a range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @return the range of health care permits
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthCarePermit>
			getHealthCarePermits(int start, int end) {

		return _healthCarePermitLocalService.getHealthCarePermits(start, end);
	}

	/**
	 * Returns the number of health care permits.
	 *
	 * @return the number of health care permits
	 */
	@Override
	public int getHealthCarePermitsCount() {
		return _healthCarePermitLocalService.getHealthCarePermitsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCarePermitLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCarePermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCarePermitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the health care permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCarePermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCarePermit the health care permit
	 * @return the health care permit that was updated
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
		updateHealthCarePermit(
			com.nbp.healthcare.stage.service.model.HealthCarePermit
				healthCarePermit) {

		return _healthCarePermitLocalService.updateHealthCarePermit(
			healthCarePermit);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthCarePermit
		updateHealthCarePermit(
			String caseId, String transaction, String nameofApplicant,
			String Category, String pirPermt, String bonafideHC,
			String tariffCode, java.util.Date dateofIssue) {

		return _healthCarePermitLocalService.updateHealthCarePermit(
			caseId, transaction, nameofApplicant, Category, pirPermt,
			bonafideHC, tariffCode, dateofIssue);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCarePermitLocalService.getBasePersistence();
	}

	@Override
	public HealthCarePermitLocalService getWrappedService() {
		return _healthCarePermitLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCarePermitLocalService healthCarePermitLocalService) {

		_healthCarePermitLocalService = healthCarePermitLocalService;
	}

	private HealthCarePermitLocalService _healthCarePermitLocalService;

}