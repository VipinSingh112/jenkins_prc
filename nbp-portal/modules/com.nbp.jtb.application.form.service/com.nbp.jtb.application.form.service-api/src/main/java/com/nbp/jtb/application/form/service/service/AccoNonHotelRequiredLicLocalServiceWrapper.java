/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccoNonHotelRequiredLicLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLicLocalService
 * @generated
 */
public class AccoNonHotelRequiredLicLocalServiceWrapper
	implements AccoNonHotelRequiredLicLocalService,
			   ServiceWrapper<AccoNonHotelRequiredLicLocalService> {

	public AccoNonHotelRequiredLicLocalServiceWrapper() {
		this(null);
	}

	public AccoNonHotelRequiredLicLocalServiceWrapper(
		AccoNonHotelRequiredLicLocalService
			accoNonHotelRequiredLicLocalService) {

		_accoNonHotelRequiredLicLocalService =
			accoNonHotelRequiredLicLocalService;
	}

	/**
	 * Adds the acco non hotel required lic to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 * @return the acco non hotel required lic that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
		addAccoNonHotelRequiredLic(
			com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
				accoNonHotelRequiredLic) {

		return _accoNonHotelRequiredLicLocalService.addAccoNonHotelRequiredLic(
			accoNonHotelRequiredLic);
	}

	/**
	 * Creates a new acco non hotel required lic with the primary key. Does not add the acco non hotel required lic to the database.
	 *
	 * @param accoNonHotelRequiredLicId the primary key for the new acco non hotel required lic
	 * @return the new acco non hotel required lic
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
		createAccoNonHotelRequiredLic(long accoNonHotelRequiredLicId) {

		return _accoNonHotelRequiredLicLocalService.
			createAccoNonHotelRequiredLic(accoNonHotelRequiredLicId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelRequiredLicLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acco non hotel required lic from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
		deleteAccoNonHotelRequiredLic(
			com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
				accoNonHotelRequiredLic) {

		return _accoNonHotelRequiredLicLocalService.
			deleteAccoNonHotelRequiredLic(accoNonHotelRequiredLic);
	}

	/**
	 * Deletes the acco non hotel required lic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 * @throws PortalException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
			deleteAccoNonHotelRequiredLic(long accoNonHotelRequiredLicId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelRequiredLicLocalService.
			deleteAccoNonHotelRequiredLic(accoNonHotelRequiredLicId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelRequiredLicLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accoNonHotelRequiredLicLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accoNonHotelRequiredLicLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accoNonHotelRequiredLicLocalService.dynamicQuery();
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

		return _accoNonHotelRequiredLicLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code>.
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

		return _accoNonHotelRequiredLicLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code>.
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

		return _accoNonHotelRequiredLicLocalService.dynamicQuery(
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

		return _accoNonHotelRequiredLicLocalService.dynamicQueryCount(
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

		return _accoNonHotelRequiredLicLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
		fetchAccoNonHotelRequiredLic(long accoNonHotelRequiredLicId) {

		return _accoNonHotelRequiredLicLocalService.
			fetchAccoNonHotelRequiredLic(accoNonHotelRequiredLicId);
	}

	/**
	 * Returns the acco non hotel required lic with the primary key.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic
	 * @throws PortalException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
			getAccoNonHotelRequiredLic(long accoNonHotelRequiredLicId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelRequiredLicLocalService.getAccoNonHotelRequiredLic(
			accoNonHotelRequiredLicId);
	}

	/**
	 * Returns a range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @return the range of acco non hotel required lics
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic>
			getAccoNonHotelRequiredLics(int start, int end) {

		return _accoNonHotelRequiredLicLocalService.getAccoNonHotelRequiredLics(
			start, end);
	}

	/**
	 * Returns the number of acco non hotel required lics.
	 *
	 * @return the number of acco non hotel required lics
	 */
	@Override
	public int getAccoNonHotelRequiredLicsCount() {
		return _accoNonHotelRequiredLicLocalService.
			getAccoNonHotelRequiredLicsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accoNonHotelRequiredLicLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accoNonHotelRequiredLicLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelRequiredLicException {

		return _accoNonHotelRequiredLicLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoNonHotelRequiredLicLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accoNonHotelRequiredLicLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acco non hotel required lic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 * @return the acco non hotel required lic that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
		updateAccoNonHotelRequiredLic(
			com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic
				accoNonHotelRequiredLic) {

		return _accoNonHotelRequiredLicLocalService.
			updateAccoNonHotelRequiredLic(accoNonHotelRequiredLic);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accoNonHotelRequiredLicLocalService.getBasePersistence();
	}

	@Override
	public AccoNonHotelRequiredLicLocalService getWrappedService() {
		return _accoNonHotelRequiredLicLocalService;
	}

	@Override
	public void setWrappedService(
		AccoNonHotelRequiredLicLocalService
			accoNonHotelRequiredLicLocalService) {

		_accoNonHotelRequiredLicLocalService =
			accoNonHotelRequiredLicLocalService;
	}

	private AccoNonHotelRequiredLicLocalService
		_accoNonHotelRequiredLicLocalService;

}