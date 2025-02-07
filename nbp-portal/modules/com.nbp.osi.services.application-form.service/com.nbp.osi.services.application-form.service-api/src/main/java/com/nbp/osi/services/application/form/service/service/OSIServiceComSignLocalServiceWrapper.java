/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OSIServiceComSignLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSignLocalService
 * @generated
 */
public class OSIServiceComSignLocalServiceWrapper
	implements OSIServiceComSignLocalService,
			   ServiceWrapper<OSIServiceComSignLocalService> {

	public OSIServiceComSignLocalServiceWrapper() {
		this(null);
	}

	public OSIServiceComSignLocalServiceWrapper(
		OSIServiceComSignLocalService osiServiceComSignLocalService) {

		_osiServiceComSignLocalService = osiServiceComSignLocalService;
	}

	/**
	 * Adds the osi service com sign to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceComSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceComSign the osi service com sign
	 * @return the osi service com sign that was added
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
		addOSIServiceComSign(
			com.nbp.osi.services.application.form.service.model.
				OSIServiceComSign osiServiceComSign) {

		return _osiServiceComSignLocalService.addOSIServiceComSign(
			osiServiceComSign);
	}

	/**
	 * Creates a new osi service com sign with the primary key. Does not add the osi service com sign to the database.
	 *
	 * @param osiComSignId the primary key for the new osi service com sign
	 * @return the new osi service com sign
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
		createOSIServiceComSign(long osiComSignId) {

		return _osiServiceComSignLocalService.createOSIServiceComSign(
			osiComSignId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceComSignLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi service com sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceComSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign that was removed
	 * @throws PortalException if a osi service com sign with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
			deleteOSIServiceComSign(long osiComSignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceComSignLocalService.deleteOSIServiceComSign(
			osiComSignId);
	}

	/**
	 * Deletes the osi service com sign from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceComSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceComSign the osi service com sign
	 * @return the osi service com sign that was removed
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
		deleteOSIServiceComSign(
			com.nbp.osi.services.application.form.service.model.
				OSIServiceComSign osiServiceComSign) {

		return _osiServiceComSignLocalService.deleteOSIServiceComSign(
			osiServiceComSign);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceComSignLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServiceComSignLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServiceComSignLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServiceComSignLocalService.dynamicQuery();
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

		return _osiServiceComSignLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignModelImpl</code>.
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

		return _osiServiceComSignLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignModelImpl</code>.
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

		return _osiServiceComSignLocalService.dynamicQuery(
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

		return _osiServiceComSignLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiServiceComSignLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
		fetchOSIServiceComSign(long osiComSignId) {

		return _osiServiceComSignLocalService.fetchOSIServiceComSign(
			osiComSignId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServiceComSignLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServiceComSignLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceComSignLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi service com sign with the primary key.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign
	 * @throws PortalException if a osi service com sign with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
			getOSIServiceComSign(long osiComSignId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceComSignLocalService.getOSIServiceComSign(
			osiComSignId);
	}

	/**
	 * Returns a range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @return the range of osi service com signs
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.OSIServiceComSign>
			getOSIServiceComSigns(int start, int end) {

		return _osiServiceComSignLocalService.getOSIServiceComSigns(start, end);
	}

	/**
	 * Returns the number of osi service com signs.
	 *
	 * @return the number of osi service com signs
	 */
	@Override
	public int getOSIServiceComSignsCount() {
		return _osiServiceComSignLocalService.getOSIServiceComSignsCount();
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
			getOsiServicesSignBy_Id(long applicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOSIServiceComSignException {

		return _osiServiceComSignLocalService.getOsiServicesSignBy_Id(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceComSignLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi service com sign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServiceComSignLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceComSign the osi service com sign
	 * @return the osi service com sign that was updated
	 */
	@Override
	public com.nbp.osi.services.application.form.service.model.OSIServiceComSign
		updateOSIServiceComSign(
			com.nbp.osi.services.application.form.service.model.
				OSIServiceComSign osiServiceComSign) {

		return _osiServiceComSignLocalService.updateOSIServiceComSign(
			osiServiceComSign);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServiceComSignLocalService.getBasePersistence();
	}

	@Override
	public OSIServiceComSignLocalService getWrappedService() {
		return _osiServiceComSignLocalService;
	}

	@Override
	public void setWrappedService(
		OSIServiceComSignLocalService osiServiceComSignLocalService) {

		_osiServiceComSignLocalService = osiServiceComSignLocalService;
	}

	private OSIServiceComSignLocalService _osiServiceComSignLocalService;

}