/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireLandEmploymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandEmploymentLocalService
 * @generated
 */
public class AcquireLandEmploymentLocalServiceWrapper
	implements AcquireLandEmploymentLocalService,
			   ServiceWrapper<AcquireLandEmploymentLocalService> {

	public AcquireLandEmploymentLocalServiceWrapper() {
		this(null);
	}

	public AcquireLandEmploymentLocalServiceWrapper(
		AcquireLandEmploymentLocalService acquireLandEmploymentLocalService) {

		_acquireLandEmploymentLocalService = acquireLandEmploymentLocalService;
	}

	/**
	 * Adds the acquire land employment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandEmployment the acquire land employment
	 * @return the acquire land employment that was added
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
		addAcquireLandEmployment(
			com.nbp.acquire.application.form.service.model.AcquireLandEmployment
				acquireLandEmployment) {

		return _acquireLandEmploymentLocalService.addAcquireLandEmployment(
			acquireLandEmployment);
	}

	/**
	 * Creates a new acquire land employment with the primary key. Does not add the acquire land employment to the database.
	 *
	 * @param acquireLandEmploymentId the primary key for the new acquire land employment
	 * @return the new acquire land employment
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
		createAcquireLandEmployment(long acquireLandEmploymentId) {

		return _acquireLandEmploymentLocalService.createAcquireLandEmployment(
			acquireLandEmploymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandEmploymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire land employment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandEmployment the acquire land employment
	 * @return the acquire land employment that was removed
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
		deleteAcquireLandEmployment(
			com.nbp.acquire.application.form.service.model.AcquireLandEmployment
				acquireLandEmployment) {

		return _acquireLandEmploymentLocalService.deleteAcquireLandEmployment(
			acquireLandEmployment);
	}

	/**
	 * Deletes the acquire land employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment that was removed
	 * @throws PortalException if a acquire land employment with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
			deleteAcquireLandEmployment(long acquireLandEmploymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandEmploymentLocalService.deleteAcquireLandEmployment(
			acquireLandEmploymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandEmploymentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireLandEmploymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireLandEmploymentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireLandEmploymentLocalService.dynamicQuery();
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

		return _acquireLandEmploymentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandEmploymentModelImpl</code>.
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

		return _acquireLandEmploymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandEmploymentModelImpl</code>.
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

		return _acquireLandEmploymentLocalService.dynamicQuery(
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

		return _acquireLandEmploymentLocalService.dynamicQueryCount(
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

		return _acquireLandEmploymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
		fetchAcquireLandEmployment(long acquireLandEmploymentId) {

		return _acquireLandEmploymentLocalService.fetchAcquireLandEmployment(
			acquireLandEmploymentId);
	}

	/**
	 * Returns the acquire land employment with the primary key.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment
	 * @throws PortalException if a acquire land employment with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
			getAcquireLandEmployment(long acquireLandEmploymentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandEmploymentLocalService.getAcquireLandEmployment(
			acquireLandEmploymentId);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
			getAcquireLandEmploymentById(long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireLandEmploymentException {

		return _acquireLandEmploymentLocalService.getAcquireLandEmploymentById(
			acquireApplicationId);
	}

	/**
	 * Returns a range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @return the range of acquire land employments
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireLandEmployment>
			getAcquireLandEmployments(int start, int end) {

		return _acquireLandEmploymentLocalService.getAcquireLandEmployments(
			start, end);
	}

	/**
	 * Returns the number of acquire land employments.
	 *
	 * @return the number of acquire land employments
	 */
	@Override
	public int getAcquireLandEmploymentsCount() {
		return _acquireLandEmploymentLocalService.
			getAcquireLandEmploymentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireLandEmploymentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireLandEmploymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireLandEmploymentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireLandEmploymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire land employment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireLandEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireLandEmployment the acquire land employment
	 * @return the acquire land employment that was updated
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireLandEmployment
		updateAcquireLandEmployment(
			com.nbp.acquire.application.form.service.model.AcquireLandEmployment
				acquireLandEmployment) {

		return _acquireLandEmploymentLocalService.updateAcquireLandEmployment(
			acquireLandEmployment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireLandEmploymentLocalService.getBasePersistence();
	}

	@Override
	public AcquireLandEmploymentLocalService getWrappedService() {
		return _acquireLandEmploymentLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireLandEmploymentLocalService acquireLandEmploymentLocalService) {

		_acquireLandEmploymentLocalService = acquireLandEmploymentLocalService;
	}

	private AcquireLandEmploymentLocalService
		_acquireLandEmploymentLocalService;

}