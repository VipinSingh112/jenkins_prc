/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantPrincipleOfficerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleOfficerLocalService
 * @generated
 */
public class SezOccupantPrincipleOfficerLocalServiceWrapper
	implements ServiceWrapper<SezOccupantPrincipleOfficerLocalService>,
			   SezOccupantPrincipleOfficerLocalService {

	public SezOccupantPrincipleOfficerLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantPrincipleOfficerLocalServiceWrapper(
		SezOccupantPrincipleOfficerLocalService
			sezOccupantPrincipleOfficerLocalService) {

		_sezOccupantPrincipleOfficerLocalService =
			sezOccupantPrincipleOfficerLocalService;
	}

	/**
	 * Adds the sez occupant principle officer to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleOfficerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantPrincipleOfficer the sez occupant principle officer
	 * @return the sez occupant principle officer that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer addSezOccupantPrincipleOfficer(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		return _sezOccupantPrincipleOfficerLocalService.
			addSezOccupantPrincipleOfficer(sezOccupantPrincipleOfficer);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleOfficerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant principle officer with the primary key. Does not add the sez occupant principle officer to the database.
	 *
	 * @param sezOccPrincOffId the primary key for the new sez occupant principle officer
	 * @return the new sez occupant principle officer
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer createSezOccupantPrincipleOfficer(
			long sezOccPrincOffId) {

		return _sezOccupantPrincipleOfficerLocalService.
			createSezOccupantPrincipleOfficer(sezOccPrincOffId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleOfficerLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occupant principle officer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleOfficerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer that was removed
	 * @throws PortalException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer deleteSezOccupantPrincipleOfficer(
				long sezOccPrincOffId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleOfficerLocalService.
			deleteSezOccupantPrincipleOfficer(sezOccPrincOffId);
	}

	/**
	 * Deletes the sez occupant principle officer from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleOfficerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantPrincipleOfficer the sez occupant principle officer
	 * @return the sez occupant principle officer that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer deleteSezOccupantPrincipleOfficer(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		return _sezOccupantPrincipleOfficerLocalService.
			deleteSezOccupantPrincipleOfficer(sezOccupantPrincipleOfficer);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantPrincipleOfficerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantPrincipleOfficerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantPrincipleOfficerLocalService.dynamicQuery();
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

		return _sezOccupantPrincipleOfficerLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerModelImpl</code>.
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

		return _sezOccupantPrincipleOfficerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerModelImpl</code>.
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

		return _sezOccupantPrincipleOfficerLocalService.dynamicQuery(
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

		return _sezOccupantPrincipleOfficerLocalService.dynamicQueryCount(
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

		return _sezOccupantPrincipleOfficerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer fetchSezOccupantPrincipleOfficer(
			long sezOccPrincOffId) {

		return _sezOccupantPrincipleOfficerLocalService.
			fetchSezOccupantPrincipleOfficer(sezOccPrincOffId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantPrincipleOfficerLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantPrincipleOfficerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantPrincipleOfficerLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleOfficerLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantPrincipleOfficer> getPrincipleOfficerById(
				long sezApplicationId) {

		return _sezOccupantPrincipleOfficerLocalService.getPrincipleOfficerById(
			sezApplicationId);
	}

	/**
	 * Returns the sez occupant principle officer with the primary key.
	 *
	 * @param sezOccPrincOffId the primary key of the sez occupant principle officer
	 * @return the sez occupant principle officer
	 * @throws PortalException if a sez occupant principle officer with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer getSezOccupantPrincipleOfficer(
				long sezOccPrincOffId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantPrincipleOfficerLocalService.
			getSezOccupantPrincipleOfficer(sezOccPrincOffId);
	}

	/**
	 * Returns a range of all the sez occupant principle officers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant principle officers
	 * @param end the upper bound of the range of sez occupant principle officers (not inclusive)
	 * @return the range of sez occupant principle officers
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantPrincipleOfficer> getSezOccupantPrincipleOfficers(
				int start, int end) {

		return _sezOccupantPrincipleOfficerLocalService.
			getSezOccupantPrincipleOfficers(start, end);
	}

	/**
	 * Returns the number of sez occupant principle officers.
	 *
	 * @return the number of sez occupant principle officers
	 */
	@Override
	public int getSezOccupantPrincipleOfficersCount() {
		return _sezOccupantPrincipleOfficerLocalService.
			getSezOccupantPrincipleOfficersCount();
	}

	/**
	 * Updates the sez occupant principle officer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantPrincipleOfficerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantPrincipleOfficer the sez occupant principle officer
	 * @return the sez occupant principle officer that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantPrincipleOfficer updateSezOccupantPrincipleOfficer(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantPrincipleOfficer sezOccupantPrincipleOfficer) {

		return _sezOccupantPrincipleOfficerLocalService.
			updateSezOccupantPrincipleOfficer(sezOccupantPrincipleOfficer);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantPrincipleOfficerLocalService.getBasePersistence();
	}

	@Override
	public SezOccupantPrincipleOfficerLocalService getWrappedService() {
		return _sezOccupantPrincipleOfficerLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantPrincipleOfficerLocalService
			sezOccupantPrincipleOfficerLocalService) {

		_sezOccupantPrincipleOfficerLocalService =
			sezOccupantPrincipleOfficerLocalService;
	}

	private SezOccupantPrincipleOfficerLocalService
		_sezOccupantPrincipleOfficerLocalService;

}