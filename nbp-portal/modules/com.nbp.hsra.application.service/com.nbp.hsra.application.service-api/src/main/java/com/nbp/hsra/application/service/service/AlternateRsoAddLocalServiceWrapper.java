/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AlternateRsoAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAddLocalService
 * @generated
 */
public class AlternateRsoAddLocalServiceWrapper
	implements AlternateRsoAddLocalService,
			   ServiceWrapper<AlternateRsoAddLocalService> {

	public AlternateRsoAddLocalServiceWrapper() {
		this(null);
	}

	public AlternateRsoAddLocalServiceWrapper(
		AlternateRsoAddLocalService alternateRsoAddLocalService) {

		_alternateRsoAddLocalService = alternateRsoAddLocalService;
	}

	/**
	 * Adds the alternate rso add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoAdd the alternate rso add
	 * @return the alternate rso add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
		addAlternateRsoAdd(
			com.nbp.hsra.application.service.model.AlternateRsoAdd
				alternateRsoAdd) {

		return _alternateRsoAddLocalService.addAlternateRsoAdd(alternateRsoAdd);
	}

	/**
	 * Creates a new alternate rso add with the primary key. Does not add the alternate rso add to the database.
	 *
	 * @param alternateRsoAddId the primary key for the new alternate rso add
	 * @return the new alternate rso add
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
		createAlternateRsoAdd(long alternateRsoAddId) {

		return _alternateRsoAddLocalService.createAlternateRsoAdd(
			alternateRsoAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoAddLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the alternate rso add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoAdd the alternate rso add
	 * @return the alternate rso add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
		deleteAlternateRsoAdd(
			com.nbp.hsra.application.service.model.AlternateRsoAdd
				alternateRsoAdd) {

		return _alternateRsoAddLocalService.deleteAlternateRsoAdd(
			alternateRsoAdd);
	}

	/**
	 * Deletes the alternate rso add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add that was removed
	 * @throws PortalException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
			deleteAlternateRsoAdd(long alternateRsoAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoAddLocalService.deleteAlternateRsoAdd(
			alternateRsoAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _alternateRsoAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _alternateRsoAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _alternateRsoAddLocalService.dynamicQuery();
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

		return _alternateRsoAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AlternateRsoAddModelImpl</code>.
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

		return _alternateRsoAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AlternateRsoAddModelImpl</code>.
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

		return _alternateRsoAddLocalService.dynamicQuery(
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

		return _alternateRsoAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _alternateRsoAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
		fetchAlternateRsoAdd(long alternateRsoAddId) {

		return _alternateRsoAddLocalService.fetchAlternateRsoAdd(
			alternateRsoAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _alternateRsoAddLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the alternate rso add with the primary key.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add
	 * @throws PortalException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
			getAlternateRsoAdd(long alternateRsoAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoAddLocalService.getAlternateRsoAdd(
			alternateRsoAddId);
	}

	/**
	 * Returns a range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of alternate rso adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AlternateRsoAdd>
			getAlternateRsoAdds(int start, int end) {

		return _alternateRsoAddLocalService.getAlternateRsoAdds(start, end);
	}

	/**
	 * Returns the number of alternate rso adds.
	 *
	 * @return the number of alternate rso adds
	 */
	@Override
	public int getAlternateRsoAddsCount() {
		return _alternateRsoAddLocalService.getAlternateRsoAddsCount();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AlternateRsoAdd> getHsraById(
			long hsraApplicationId) {

		return _alternateRsoAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _alternateRsoAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _alternateRsoAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the alternate rso add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoAdd the alternate rso add
	 * @return the alternate rso add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoAdd
		updateAlternateRsoAdd(
			com.nbp.hsra.application.service.model.AlternateRsoAdd
				alternateRsoAdd) {

		return _alternateRsoAddLocalService.updateAlternateRsoAdd(
			alternateRsoAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _alternateRsoAddLocalService.getBasePersistence();
	}

	@Override
	public AlternateRsoAddLocalService getWrappedService() {
		return _alternateRsoAddLocalService;
	}

	@Override
	public void setWrappedService(
		AlternateRsoAddLocalService alternateRsoAddLocalService) {

		_alternateRsoAddLocalService = alternateRsoAddLocalService;
	}

	private AlternateRsoAddLocalService _alternateRsoAddLocalService;

}