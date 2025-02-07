/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link DirectorDetailsAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DirectorDetailsAddLocalService
 * @generated
 */
public class DirectorDetailsAddLocalServiceWrapper
	implements DirectorDetailsAddLocalService,
			   ServiceWrapper<DirectorDetailsAddLocalService> {

	public DirectorDetailsAddLocalServiceWrapper() {
		this(null);
	}

	public DirectorDetailsAddLocalServiceWrapper(
		DirectorDetailsAddLocalService directorDetailsAddLocalService) {

		_directorDetailsAddLocalService = directorDetailsAddLocalService;
	}

	/**
	 * Adds the director details add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorDetailsAdd the director details add
	 * @return the director details add that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
		addDirectorDetailsAdd(
			com.nbp.quary.application.form.service.model.DirectorDetailsAdd
				directorDetailsAdd) {

		return _directorDetailsAddLocalService.addDirectorDetailsAdd(
			directorDetailsAdd);
	}

	/**
	 * Creates a new director details add with the primary key. Does not add the director details add to the database.
	 *
	 * @param directorDetailsAddId the primary key for the new director details add
	 * @return the new director details add
	 */
	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
		createDirectorDetailsAdd(long directorDetailsAddId) {

		return _directorDetailsAddLocalService.createDirectorDetailsAdd(
			directorDetailsAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorDetailsAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the director details add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorDetailsAdd the director details add
	 * @return the director details add that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
		deleteDirectorDetailsAdd(
			com.nbp.quary.application.form.service.model.DirectorDetailsAdd
				directorDetailsAdd) {

		return _directorDetailsAddLocalService.deleteDirectorDetailsAdd(
			directorDetailsAdd);
	}

	/**
	 * Deletes the director details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add that was removed
	 * @throws PortalException if a director details add with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
			deleteDirectorDetailsAdd(long directorDetailsAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorDetailsAddLocalService.deleteDirectorDetailsAdd(
			directorDetailsAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorDetailsAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _directorDetailsAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _directorDetailsAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _directorDetailsAddLocalService.dynamicQuery();
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

		return _directorDetailsAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.DirectorDetailsAddModelImpl</code>.
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

		return _directorDetailsAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.DirectorDetailsAddModelImpl</code>.
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

		return _directorDetailsAddLocalService.dynamicQuery(
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

		return _directorDetailsAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _directorDetailsAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
		fetchDirectorDetailsAdd(long directorDetailsAddId) {

		return _directorDetailsAddLocalService.fetchDirectorDetailsAdd(
			directorDetailsAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _directorDetailsAddLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the director details add with the primary key.
	 *
	 * @param directorDetailsAddId the primary key of the director details add
	 * @return the director details add
	 * @throws PortalException if a director details add with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
			getDirectorDetailsAdd(long directorDetailsAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorDetailsAddLocalService.getDirectorDetailsAdd(
			directorDetailsAddId);
	}

	/**
	 * Returns a range of all the director details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.DirectorDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of director details adds
	 * @param end the upper bound of the range of director details adds (not inclusive)
	 * @return the range of director details adds
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.DirectorDetailsAdd>
			getDirectorDetailsAdds(int start, int end) {

		return _directorDetailsAddLocalService.getDirectorDetailsAdds(
			start, end);
	}

	/**
	 * Returns the number of director details adds.
	 *
	 * @return the number of director details adds
	 */
	@Override
	public int getDirectorDetailsAddsCount() {
		return _directorDetailsAddLocalService.getDirectorDetailsAddsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _directorDetailsAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _directorDetailsAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _directorDetailsAddLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.DirectorDetailsAdd>
			getQuarry_ById(long quarryApplicationId) {

		return _directorDetailsAddLocalService.getQuarry_ById(
			quarryApplicationId);
	}

	/**
	 * Updates the director details add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DirectorDetailsAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param directorDetailsAdd the director details add
	 * @return the director details add that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.DirectorDetailsAdd
		updateDirectorDetailsAdd(
			com.nbp.quary.application.form.service.model.DirectorDetailsAdd
				directorDetailsAdd) {

		return _directorDetailsAddLocalService.updateDirectorDetailsAdd(
			directorDetailsAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _directorDetailsAddLocalService.getBasePersistence();
	}

	@Override
	public DirectorDetailsAddLocalService getWrappedService() {
		return _directorDetailsAddLocalService;
	}

	@Override
	public void setWrappedService(
		DirectorDetailsAddLocalService directorDetailsAddLocalService) {

		_directorDetailsAddLocalService = directorDetailsAddLocalService;
	}

	private DirectorDetailsAddLocalService _directorDetailsAddLocalService;

}