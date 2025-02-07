/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneGeneralBussinessAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddressLocalService
 * @generated
 */
public class SezZoneGeneralBussinessAddressLocalServiceWrapper
	implements ServiceWrapper<SezZoneGeneralBussinessAddressLocalService>,
			   SezZoneGeneralBussinessAddressLocalService {

	public SezZoneGeneralBussinessAddressLocalServiceWrapper() {
		this(null);
	}

	public SezZoneGeneralBussinessAddressLocalServiceWrapper(
		SezZoneGeneralBussinessAddressLocalService
			sezZoneGeneralBussinessAddressLocalService) {

		_sezZoneGeneralBussinessAddressLocalService =
			sezZoneGeneralBussinessAddressLocalService;
	}

	/**
	 * Adds the sez zone general bussiness address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress addSezZoneGeneralBussinessAddress(
			com.nbp.sez.status.application.form.service.model.
				SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		return _sezZoneGeneralBussinessAddressLocalService.
			addSezZoneGeneralBussinessAddress(sezZoneGeneralBussinessAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBussinessAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone general bussiness address with the primary key. Does not add the sez zone general bussiness address to the database.
	 *
	 * @param sezZoneGenBussAddressId the primary key for the new sez zone general bussiness address
	 * @return the new sez zone general bussiness address
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress createSezZoneGeneralBussinessAddress(
			long sezZoneGenBussAddressId) {

		return _sezZoneGeneralBussinessAddressLocalService.
			createSezZoneGeneralBussinessAddress(sezZoneGenBussAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBussinessAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 * @throws PortalException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress deleteSezZoneGeneralBussinessAddress(
				long sezZoneGenBussAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBussinessAddressLocalService.
			deleteSezZoneGeneralBussinessAddress(sezZoneGenBussAddressId);
	}

	/**
	 * Deletes the sez zone general bussiness address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress deleteSezZoneGeneralBussinessAddress(
			com.nbp.sez.status.application.form.service.model.
				SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		return _sezZoneGeneralBussinessAddressLocalService.
			deleteSezZoneGeneralBussinessAddress(
				sezZoneGeneralBussinessAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneGeneralBussinessAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneGeneralBussinessAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneGeneralBussinessAddressLocalService.dynamicQuery();
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

		return _sezZoneGeneralBussinessAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl</code>.
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

		return _sezZoneGeneralBussinessAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl</code>.
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

		return _sezZoneGeneralBussinessAddressLocalService.dynamicQuery(
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

		return _sezZoneGeneralBussinessAddressLocalService.dynamicQueryCount(
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

		return _sezZoneGeneralBussinessAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress fetchSezZoneGeneralBussinessAddress(
			long sezZoneGenBussAddressId) {

		return _sezZoneGeneralBussinessAddressLocalService.
			fetchSezZoneGeneralBussinessAddress(sezZoneGenBussAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneGeneralBussinessAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneGeneralBussinessAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneGeneralBussinessAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBussinessAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress getSezStatusBy_AT_GBI(
				long generalBussinessId, String addressType)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezZoneGeneralBussinessAddressException {

		return _sezZoneGeneralBussinessAddressLocalService.
			getSezStatusBy_AT_GBI(generalBussinessId, addressType);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress getSezStatusBy_AT_SAI(
				long sezApplicationId, String addressType)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezZoneGeneralBussinessAddressException {

		return _sezZoneGeneralBussinessAddressLocalService.
			getSezStatusBy_AT_SAI(sezApplicationId, addressType);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress getSezStatusBy_Id(long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezZoneGeneralBussinessAddressException {

		return _sezZoneGeneralBussinessAddressLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Returns the sez zone general bussiness address with the primary key.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address
	 * @throws PortalException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress getSezZoneGeneralBussinessAddress(
				long sezZoneGenBussAddressId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneGeneralBussinessAddressLocalService.
			getSezZoneGeneralBussinessAddress(sezZoneGenBussAddressId);
	}

	/**
	 * Returns a range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @return the range of sez zone general bussiness addresses
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezZoneGeneralBussinessAddress> getSezZoneGeneralBussinessAddresses(
				int start, int end) {

		return _sezZoneGeneralBussinessAddressLocalService.
			getSezZoneGeneralBussinessAddresses(start, end);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses.
	 *
	 * @return the number of sez zone general bussiness addresses
	 */
	@Override
	public int getSezZoneGeneralBussinessAddressesCount() {
		return _sezZoneGeneralBussinessAddressLocalService.
			getSezZoneGeneralBussinessAddressesCount();
	}

	/**
	 * Updates the sez zone general bussiness address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneGeneralBussinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezZoneGeneralBussinessAddress updateSezZoneGeneralBussinessAddress(
			com.nbp.sez.status.application.form.service.model.
				SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		return _sezZoneGeneralBussinessAddressLocalService.
			updateSezZoneGeneralBussinessAddress(
				sezZoneGeneralBussinessAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneGeneralBussinessAddressLocalService.getBasePersistence();
	}

	@Override
	public SezZoneGeneralBussinessAddressLocalService getWrappedService() {
		return _sezZoneGeneralBussinessAddressLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneGeneralBussinessAddressLocalService
			sezZoneGeneralBussinessAddressLocalService) {

		_sezZoneGeneralBussinessAddressLocalService =
			sezZoneGeneralBussinessAddressLocalService;
	}

	private SezZoneGeneralBussinessAddressLocalService
		_sezZoneGeneralBussinessAddressLocalService;

}