/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevSharePrincipalAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAddLocalService
 * @generated
 */
public class SezDevSharePrincipalAddLocalServiceWrapper
	implements ServiceWrapper<SezDevSharePrincipalAddLocalService>,
			   SezDevSharePrincipalAddLocalService {

	public SezDevSharePrincipalAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevSharePrincipalAddLocalServiceWrapper(
		SezDevSharePrincipalAddLocalService
			sezDevSharePrincipalAddLocalService) {

		_sezDevSharePrincipalAddLocalService =
			sezDevSharePrincipalAddLocalService;
	}

	/**
	 * Adds the sez dev share principal add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePrincipalAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePrincipalAdd the sez dev share principal add
	 * @return the sez dev share principal add that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd addSezDevSharePrincipalAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		return _sezDevSharePrincipalAddLocalService.addSezDevSharePrincipalAdd(
			sezDevSharePrincipalAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePrincipalAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev share principal add with the primary key. Does not add the sez dev share principal add to the database.
	 *
	 * @param sezDevSharePrincipalAddId the primary key for the new sez dev share principal add
	 * @return the new sez dev share principal add
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd createSezDevSharePrincipalAdd(
				long sezDevSharePrincipalAddId) {

		return _sezDevSharePrincipalAddLocalService.
			createSezDevSharePrincipalAdd(sezDevSharePrincipalAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePrincipalAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev share principal add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePrincipalAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add that was removed
	 * @throws PortalException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd deleteSezDevSharePrincipalAdd(
					long sezDevSharePrincipalAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePrincipalAddLocalService.
			deleteSezDevSharePrincipalAdd(sezDevSharePrincipalAddId);
	}

	/**
	 * Deletes the sez dev share principal add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePrincipalAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePrincipalAdd the sez dev share principal add
	 * @return the sez dev share principal add that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd deleteSezDevSharePrincipalAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		return _sezDevSharePrincipalAddLocalService.
			deleteSezDevSharePrincipalAdd(sezDevSharePrincipalAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevSharePrincipalAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevSharePrincipalAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevSharePrincipalAddLocalService.dynamicQuery();
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

		return _sezDevSharePrincipalAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddModelImpl</code>.
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

		return _sezDevSharePrincipalAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddModelImpl</code>.
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

		return _sezDevSharePrincipalAddLocalService.dynamicQuery(
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

		return _sezDevSharePrincipalAddLocalService.dynamicQueryCount(
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

		return _sezDevSharePrincipalAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd fetchSezDevSharePrincipalAdd(
				long sezDevSharePrincipalAddId) {

		return _sezDevSharePrincipalAddLocalService.
			fetchSezDevSharePrincipalAdd(sezDevSharePrincipalAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevSharePrincipalAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevSharePrincipalAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevSharePrincipalAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePrincipalAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd> getSezById(long sezStatusApplicationId) {

		return _sezDevSharePrincipalAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev share principal add with the primary key.
	 *
	 * @param sezDevSharePrincipalAddId the primary key of the sez dev share principal add
	 * @return the sez dev share principal add
	 * @throws PortalException if a sez dev share principal add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd getSezDevSharePrincipalAdd(
					long sezDevSharePrincipalAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevSharePrincipalAddLocalService.getSezDevSharePrincipalAdd(
			sezDevSharePrincipalAddId);
	}

	/**
	 * Returns a range of all the sez dev share principal adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevSharePrincipalAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share principal adds
	 * @param end the upper bound of the range of sez dev share principal adds (not inclusive)
	 * @return the range of sez dev share principal adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd> getSezDevSharePrincipalAdds(
				int start, int end) {

		return _sezDevSharePrincipalAddLocalService.getSezDevSharePrincipalAdds(
			start, end);
	}

	/**
	 * Returns the number of sez dev share principal adds.
	 *
	 * @return the number of sez dev share principal adds
	 */
	@Override
	public int getSezDevSharePrincipalAddsCount() {
		return _sezDevSharePrincipalAddLocalService.
			getSezDevSharePrincipalAddsCount();
	}

	/**
	 * Updates the sez dev share principal add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevSharePrincipalAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharePrincipalAdd the sez dev share principal add
	 * @return the sez dev share principal add that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevSharePrincipalAdd updateSezDevSharePrincipalAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {

		return _sezDevSharePrincipalAddLocalService.
			updateSezDevSharePrincipalAdd(sezDevSharePrincipalAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevSharePrincipalAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevSharePrincipalAddLocalService getWrappedService() {
		return _sezDevSharePrincipalAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevSharePrincipalAddLocalService
			sezDevSharePrincipalAddLocalService) {

		_sezDevSharePrincipalAddLocalService =
			sezDevSharePrincipalAddLocalService;
	}

	private SezDevSharePrincipalAddLocalService
		_sezDevSharePrincipalAddLocalService;

}