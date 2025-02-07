/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevShareCorporationBusAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareCorporationBusAddLocalService
 * @generated
 */
public class SezDevShareCorporationBusAddLocalServiceWrapper
	implements ServiceWrapper<SezDevShareCorporationBusAddLocalService>,
			   SezDevShareCorporationBusAddLocalService {

	public SezDevShareCorporationBusAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevShareCorporationBusAddLocalServiceWrapper(
		SezDevShareCorporationBusAddLocalService
			sezDevShareCorporationBusAddLocalService) {

		_sezDevShareCorporationBusAddLocalService =
			sezDevShareCorporationBusAddLocalService;
	}

	/**
	 * Adds the sez dev share corporation bus add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareCorporationBusAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareCorporationBusAdd the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd addSezDevShareCorporationBusAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		return _sezDevShareCorporationBusAddLocalService.
			addSezDevShareCorporationBusAdd(sezDevShareCorporationBusAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareCorporationBusAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev share corporation bus add with the primary key. Does not add the sez dev share corporation bus add to the database.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key for the new sez dev share corporation bus add
	 * @return the new sez dev share corporation bus add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd createSezDevShareCorporationBusAdd(
			long sezDevCorporationBusinessAddId) {

		return _sezDevShareCorporationBusAddLocalService.
			createSezDevShareCorporationBusAdd(sezDevCorporationBusinessAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareCorporationBusAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev share corporation bus add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareCorporationBusAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was removed
	 * @throws PortalException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd deleteSezDevShareCorporationBusAdd(
				long sezDevCorporationBusinessAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareCorporationBusAddLocalService.
			deleteSezDevShareCorporationBusAdd(sezDevCorporationBusinessAddId);
	}

	/**
	 * Deletes the sez dev share corporation bus add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareCorporationBusAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareCorporationBusAdd the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd deleteSezDevShareCorporationBusAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		return _sezDevShareCorporationBusAddLocalService.
			deleteSezDevShareCorporationBusAdd(sezDevShareCorporationBusAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevShareCorporationBusAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevShareCorporationBusAddLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevShareCorporationBusAddLocalService.dynamicQuery();
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

		return _sezDevShareCorporationBusAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareCorporationBusAddModelImpl</code>.
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

		return _sezDevShareCorporationBusAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareCorporationBusAddModelImpl</code>.
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

		return _sezDevShareCorporationBusAddLocalService.dynamicQuery(
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

		return _sezDevShareCorporationBusAddLocalService.dynamicQueryCount(
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

		return _sezDevShareCorporationBusAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd fetchSezDevShareCorporationBusAdd(
			long sezDevCorporationBusinessAddId) {

		return _sezDevShareCorporationBusAddLocalService.
			fetchSezDevShareCorporationBusAdd(sezDevCorporationBusinessAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevShareCorporationBusAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevShareCorporationBusAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareCorporationBusAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareCorporationBusAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareCorporationBusAdd> getSezById(
				long sezStatusApplicationId) {

		return _sezDevShareCorporationBusAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev share corporation bus add with the primary key.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add
	 * @throws PortalException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd getSezDevShareCorporationBusAdd(
				long sezDevCorporationBusinessAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareCorporationBusAddLocalService.
			getSezDevShareCorporationBusAdd(sezDevCorporationBusinessAddId);
	}

	/**
	 * Returns a range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @return the range of sez dev share corporation bus adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareCorporationBusAdd> getSezDevShareCorporationBusAdds(
				int start, int end) {

		return _sezDevShareCorporationBusAddLocalService.
			getSezDevShareCorporationBusAdds(start, end);
	}

	/**
	 * Returns the number of sez dev share corporation bus adds.
	 *
	 * @return the number of sez dev share corporation bus adds
	 */
	@Override
	public int getSezDevShareCorporationBusAddsCount() {
		return _sezDevShareCorporationBusAddLocalService.
			getSezDevShareCorporationBusAddsCount();
	}

	/**
	 * Updates the sez dev share corporation bus add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareCorporationBusAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareCorporationBusAdd the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareCorporationBusAdd updateSezDevShareCorporationBusAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		return _sezDevShareCorporationBusAddLocalService.
			updateSezDevShareCorporationBusAdd(sezDevShareCorporationBusAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevShareCorporationBusAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevShareCorporationBusAddLocalService getWrappedService() {
		return _sezDevShareCorporationBusAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevShareCorporationBusAddLocalService
			sezDevShareCorporationBusAddLocalService) {

		_sezDevShareCorporationBusAddLocalService =
			sezDevShareCorporationBusAddLocalService;
	}

	private SezDevShareCorporationBusAddLocalService
		_sezDevShareCorporationBusAddLocalService;

}