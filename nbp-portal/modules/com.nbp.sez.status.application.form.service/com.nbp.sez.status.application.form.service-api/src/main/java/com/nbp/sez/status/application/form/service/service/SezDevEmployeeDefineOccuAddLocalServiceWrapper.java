/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevEmployeeDefineOccuAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeDefineOccuAddLocalService
 * @generated
 */
public class SezDevEmployeeDefineOccuAddLocalServiceWrapper
	implements ServiceWrapper<SezDevEmployeeDefineOccuAddLocalService>,
			   SezDevEmployeeDefineOccuAddLocalService {

	public SezDevEmployeeDefineOccuAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevEmployeeDefineOccuAddLocalServiceWrapper(
		SezDevEmployeeDefineOccuAddLocalService
			sezDevEmployeeDefineOccuAddLocalService) {

		_sezDevEmployeeDefineOccuAddLocalService =
			sezDevEmployeeDefineOccuAddLocalService;
	}

	/**
	 * Adds the sez dev employee define occu add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeDefineOccuAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeDefineOccuAdd the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd addSezDevEmployeeDefineOccuAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		return _sezDevEmployeeDefineOccuAddLocalService.
			addSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeDefineOccuAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev employee define occu add with the primary key. Does not add the sez dev employee define occu add to the database.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key for the new sez dev employee define occu add
	 * @return the new sez dev employee define occu add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd createSezDevEmployeeDefineOccuAdd(
			long sezDevEmployeeDefineOccuAddId) {

		return _sezDevEmployeeDefineOccuAddLocalService.
			createSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeDefineOccuAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev employee define occu add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeDefineOccuAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was removed
	 * @throws PortalException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd deleteSezDevEmployeeDefineOccuAdd(
				long sezDevEmployeeDefineOccuAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeDefineOccuAddLocalService.
			deleteSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Deletes the sez dev employee define occu add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeDefineOccuAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeDefineOccuAdd the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd deleteSezDevEmployeeDefineOccuAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		return _sezDevEmployeeDefineOccuAddLocalService.
			deleteSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevEmployeeDefineOccuAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevEmployeeDefineOccuAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevEmployeeDefineOccuAddLocalService.dynamicQuery();
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

		return _sezDevEmployeeDefineOccuAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeDefineOccuAddModelImpl</code>.
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

		return _sezDevEmployeeDefineOccuAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeDefineOccuAddModelImpl</code>.
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

		return _sezDevEmployeeDefineOccuAddLocalService.dynamicQuery(
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

		return _sezDevEmployeeDefineOccuAddLocalService.dynamicQueryCount(
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

		return _sezDevEmployeeDefineOccuAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd fetchSezDevEmployeeDefineOccuAdd(
			long sezDevEmployeeDefineOccuAddId) {

		return _sezDevEmployeeDefineOccuAddLocalService.
			fetchSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevEmployeeDefineOccuAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevEmployeeDefineOccuAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevEmployeeDefineOccuAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeDefineOccuAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevEmployeeDefineOccuAdd> getSezById(
				long sezStatusApplicationId) {

		return _sezDevEmployeeDefineOccuAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev employee define occu add with the primary key.
	 *
	 * @param sezDevEmployeeDefineOccuAddId the primary key of the sez dev employee define occu add
	 * @return the sez dev employee define occu add
	 * @throws PortalException if a sez dev employee define occu add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd getSezDevEmployeeDefineOccuAdd(
				long sezDevEmployeeDefineOccuAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevEmployeeDefineOccuAddLocalService.
			getSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAddId);
	}

	/**
	 * Returns a range of all the sez dev employee define occu adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevEmployeeDefineOccuAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev employee define occu adds
	 * @param end the upper bound of the range of sez dev employee define occu adds (not inclusive)
	 * @return the range of sez dev employee define occu adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevEmployeeDefineOccuAdd> getSezDevEmployeeDefineOccuAdds(
				int start, int end) {

		return _sezDevEmployeeDefineOccuAddLocalService.
			getSezDevEmployeeDefineOccuAdds(start, end);
	}

	/**
	 * Returns the number of sez dev employee define occu adds.
	 *
	 * @return the number of sez dev employee define occu adds
	 */
	@Override
	public int getSezDevEmployeeDefineOccuAddsCount() {
		return _sezDevEmployeeDefineOccuAddLocalService.
			getSezDevEmployeeDefineOccuAddsCount();
	}

	/**
	 * Updates the sez dev employee define occu add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevEmployeeDefineOccuAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevEmployeeDefineOccuAdd the sez dev employee define occu add
	 * @return the sez dev employee define occu add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevEmployeeDefineOccuAdd updateSezDevEmployeeDefineOccuAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevEmployeeDefineOccuAdd sezDevEmployeeDefineOccuAdd) {

		return _sezDevEmployeeDefineOccuAddLocalService.
			updateSezDevEmployeeDefineOccuAdd(sezDevEmployeeDefineOccuAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevEmployeeDefineOccuAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevEmployeeDefineOccuAddLocalService getWrappedService() {
		return _sezDevEmployeeDefineOccuAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevEmployeeDefineOccuAddLocalService
			sezDevEmployeeDefineOccuAddLocalService) {

		_sezDevEmployeeDefineOccuAddLocalService =
			sezDevEmployeeDefineOccuAddLocalService;
	}

	private SezDevEmployeeDefineOccuAddLocalService
		_sezDevEmployeeDefineOccuAddLocalService;

}