/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OSIServiceSupportingDocIndLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocIndLocalService
 * @generated
 */
public class OSIServiceSupportingDocIndLocalServiceWrapper
	implements OSIServiceSupportingDocIndLocalService,
			   ServiceWrapper<OSIServiceSupportingDocIndLocalService> {

	public OSIServiceSupportingDocIndLocalServiceWrapper() {
		this(null);
	}

	public OSIServiceSupportingDocIndLocalServiceWrapper(
		OSIServiceSupportingDocIndLocalService
			osiServiceSupportingDocIndLocalService) {

		_osiServiceSupportingDocIndLocalService =
			osiServiceSupportingDocIndLocalService;
	}

	/**
	 * Adds the osi service supporting doc ind to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceSupportingDocIndLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceSupportingDocInd the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd addOSIServiceSupportingDocInd(
			com.nbp.osi.services.application.form.service.model.
				OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		return _osiServiceSupportingDocIndLocalService.
			addOSIServiceSupportingDocInd(osiServiceSupportingDocInd);
	}

	/**
	 * Creates a new osi service supporting doc ind with the primary key. Does not add the osi service supporting doc ind to the database.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key for the new osi service supporting doc ind
	 * @return the new osi service supporting doc ind
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd createOSIServiceSupportingDocInd(
			long oSIServiceSupportingDocIndId) {

		return _osiServiceSupportingDocIndLocalService.
			createOSIServiceSupportingDocInd(oSIServiceSupportingDocIndId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceSupportingDocIndLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi service supporting doc ind with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceSupportingDocIndLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was removed
	 * @throws PortalException if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd deleteOSIServiceSupportingDocInd(
				long oSIServiceSupportingDocIndId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceSupportingDocIndLocalService.
			deleteOSIServiceSupportingDocInd(oSIServiceSupportingDocIndId);
	}

	/**
	 * Deletes the osi service supporting doc ind from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceSupportingDocIndLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceSupportingDocInd the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd deleteOSIServiceSupportingDocInd(
			com.nbp.osi.services.application.form.service.model.
				OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		return _osiServiceSupportingDocIndLocalService.
			deleteOSIServiceSupportingDocInd(osiServiceSupportingDocInd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceSupportingDocIndLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServiceSupportingDocIndLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServiceSupportingDocIndLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServiceSupportingDocIndLocalService.dynamicQuery();
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

		return _osiServiceSupportingDocIndLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndModelImpl</code>.
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

		return _osiServiceSupportingDocIndLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndModelImpl</code>.
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

		return _osiServiceSupportingDocIndLocalService.dynamicQuery(
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

		return _osiServiceSupportingDocIndLocalService.dynamicQueryCount(
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

		return _osiServiceSupportingDocIndLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd fetchOSIServiceSupportingDocInd(
			long oSIServiceSupportingDocIndId) {

		return _osiServiceSupportingDocIndLocalService.
			fetchOSIServiceSupportingDocInd(oSIServiceSupportingDocIndId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServiceSupportingDocIndLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServiceSupportingDocIndLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceSupportingDocIndLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd getOSIService_ById(long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOSIServiceSupportingDocIndException {

		return _osiServiceSupportingDocIndLocalService.getOSIService_ById(
			applicationId);
	}

	/**
	 * Returns the osi service supporting doc ind with the primary key.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind
	 * @throws PortalException if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd getOSIServiceSupportingDocInd(
				long oSIServiceSupportingDocIndId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceSupportingDocIndLocalService.
			getOSIServiceSupportingDocInd(oSIServiceSupportingDocIndId);
	}

	/**
	 * Returns a range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @return the range of osi service supporting doc inds
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OSIServiceSupportingDocInd> getOSIServiceSupportingDocInds(
				int start, int end) {

		return _osiServiceSupportingDocIndLocalService.
			getOSIServiceSupportingDocInds(start, end);
	}

	/**
	 * Returns the number of osi service supporting doc inds.
	 *
	 * @return the number of osi service supporting doc inds
	 */
	@Override
	public int getOSIServiceSupportingDocIndsCount() {
		return _osiServiceSupportingDocIndLocalService.
			getOSIServiceSupportingDocIndsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceSupportingDocIndLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi service supporting doc ind in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceSupportingDocIndLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceSupportingDocInd the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.
		OSIServiceSupportingDocInd updateOSIServiceSupportingDocInd(
			com.nbp.osi.services.application.form.service.model.
				OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		return _osiServiceSupportingDocIndLocalService.
			updateOSIServiceSupportingDocInd(osiServiceSupportingDocInd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServiceSupportingDocIndLocalService.getBasePersistence();
	}

	@Override
	public OSIServiceSupportingDocIndLocalService getWrappedService() {
		return _osiServiceSupportingDocIndLocalService;
	}

	@Override
	public void setWrappedService(
		OSIServiceSupportingDocIndLocalService
			osiServiceSupportingDocIndLocalService) {

		_osiServiceSupportingDocIndLocalService =
			osiServiceSupportingDocIndLocalService;
	}

	private OSIServiceSupportingDocIndLocalService
		_osiServiceSupportingDocIndLocalService;

}