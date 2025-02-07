/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSectionOneAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneAddLocalService
 * @generated
 */
public class NcbjSectionOneAddLocalServiceWrapper
	implements NcbjSectionOneAddLocalService,
			   ServiceWrapper<NcbjSectionOneAddLocalService> {

	public NcbjSectionOneAddLocalServiceWrapper() {
		this(null);
	}

	public NcbjSectionOneAddLocalServiceWrapper(
		NcbjSectionOneAddLocalService ncbjSectionOneAddLocalService) {

		_ncbjSectionOneAddLocalService = ncbjSectionOneAddLocalService;
	}

	/**
	 * Adds the ncbj section one add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOneAdd the ncbj section one add
	 * @return the ncbj section one add that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
		addNcbjSectionOneAdd(
			com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
				ncbjSectionOneAdd) {

		return _ncbjSectionOneAddLocalService.addNcbjSectionOneAdd(
			ncbjSectionOneAdd);
	}

	/**
	 * Creates a new ncbj section one add with the primary key. Does not add the ncbj section one add to the database.
	 *
	 * @param ncbjSectionOneAddId the primary key for the new ncbj section one add
	 * @return the new ncbj section one add
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
		createNcbjSectionOneAdd(long ncbjSectionOneAddId) {

		return _ncbjSectionOneAddLocalService.createNcbjSectionOneAdd(
			ncbjSectionOneAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj section one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add that was removed
	 * @throws PortalException if a ncbj section one add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
			deleteNcbjSectionOneAdd(long ncbjSectionOneAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneAddLocalService.deleteNcbjSectionOneAdd(
			ncbjSectionOneAddId);
	}

	/**
	 * Deletes the ncbj section one add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOneAdd the ncbj section one add
	 * @return the ncbj section one add that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
		deleteNcbjSectionOneAdd(
			com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
				ncbjSectionOneAdd) {

		return _ncbjSectionOneAddLocalService.deleteNcbjSectionOneAdd(
			ncbjSectionOneAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSectionOneAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSectionOneAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSectionOneAddLocalService.dynamicQuery();
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

		return _ncbjSectionOneAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddModelImpl</code>.
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

		return _ncbjSectionOneAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddModelImpl</code>.
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

		return _ncbjSectionOneAddLocalService.dynamicQuery(
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

		return _ncbjSectionOneAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjSectionOneAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
		fetchNcbjSectionOneAdd(long ncbjSectionOneAddId) {

		return _ncbjSectionOneAddLocalService.fetchNcbjSectionOneAdd(
			ncbjSectionOneAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSectionOneAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSectionOneAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd>
			getNCBJById(long ncbjApplicationId) {

		return _ncbjSectionOneAddLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one add with the primary key.
	 *
	 * @param ncbjSectionOneAddId the primary key of the ncbj section one add
	 * @return the ncbj section one add
	 * @throws PortalException if a ncbj section one add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
			getNcbjSectionOneAdd(long ncbjSectionOneAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneAddLocalService.getNcbjSectionOneAdd(
			ncbjSectionOneAddId);
	}

	/**
	 * Returns a range of all the ncbj section one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section one adds
	 * @param end the upper bound of the range of ncbj section one adds (not inclusive)
	 * @return the range of ncbj section one adds
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd>
			getNcbjSectionOneAdds(int start, int end) {

		return _ncbjSectionOneAddLocalService.getNcbjSectionOneAdds(start, end);
	}

	/**
	 * Returns the number of ncbj section one adds.
	 *
	 * @return the number of ncbj section one adds
	 */
	@Override
	public int getNcbjSectionOneAddsCount() {
		return _ncbjSectionOneAddLocalService.getNcbjSectionOneAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionOneAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj section one add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOneAdd the ncbj section one add
	 * @return the ncbj section one add that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
		updateNcbjSectionOneAdd(
			com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd
				ncbjSectionOneAdd) {

		return _ncbjSectionOneAddLocalService.updateNcbjSectionOneAdd(
			ncbjSectionOneAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSectionOneAddLocalService.getBasePersistence();
	}

	@Override
	public NcbjSectionOneAddLocalService getWrappedService() {
		return _ncbjSectionOneAddLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionOneAddLocalService ncbjSectionOneAddLocalService) {

		_ncbjSectionOneAddLocalService = ncbjSectionOneAddLocalService;
	}

	private NcbjSectionOneAddLocalService _ncbjSectionOneAddLocalService;

}