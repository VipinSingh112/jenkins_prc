/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualifedExpertAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertAddLocalService
 * @generated
 */
public class QualifedExpertAddLocalServiceWrapper
	implements QualifedExpertAddLocalService,
			   ServiceWrapper<QualifedExpertAddLocalService> {

	public QualifedExpertAddLocalServiceWrapper() {
		this(null);
	}

	public QualifedExpertAddLocalServiceWrapper(
		QualifedExpertAddLocalService qualifedExpertAddLocalService) {

		_qualifedExpertAddLocalService = qualifedExpertAddLocalService;
	}

	/**
	 * Adds the qualifed expert add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertAdd the qualifed expert add
	 * @return the qualifed expert add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
		addQualifedExpertAdd(
			com.nbp.hsra.application.service.model.QualifedExpertAdd
				qualifedExpertAdd) {

		return _qualifedExpertAddLocalService.addQualifedExpertAdd(
			qualifedExpertAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new qualifed expert add with the primary key. Does not add the qualifed expert add to the database.
	 *
	 * @param qualifedExpertAddId the primary key for the new qualifed expert add
	 * @return the new qualifed expert add
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
		createQualifedExpertAdd(long qualifedExpertAddId) {

		return _qualifedExpertAddLocalService.createQualifedExpertAdd(
			qualifedExpertAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the qualifed expert add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add that was removed
	 * @throws PortalException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
			deleteQualifedExpertAdd(long qualifedExpertAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertAddLocalService.deleteQualifedExpertAdd(
			qualifedExpertAddId);
	}

	/**
	 * Deletes the qualifed expert add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertAdd the qualifed expert add
	 * @return the qualifed expert add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
		deleteQualifedExpertAdd(
			com.nbp.hsra.application.service.model.QualifedExpertAdd
				qualifedExpertAdd) {

		return _qualifedExpertAddLocalService.deleteQualifedExpertAdd(
			qualifedExpertAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualifedExpertAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualifedExpertAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualifedExpertAddLocalService.dynamicQuery();
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

		return _qualifedExpertAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertAddModelImpl</code>.
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

		return _qualifedExpertAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertAddModelImpl</code>.
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

		return _qualifedExpertAddLocalService.dynamicQuery(
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

		return _qualifedExpertAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _qualifedExpertAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
		fetchQualifedExpertAdd(long qualifedExpertAddId) {

		return _qualifedExpertAddLocalService.fetchQualifedExpertAdd(
			qualifedExpertAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualifedExpertAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualifedExpertAdd> getHsraById(
			long hsraApplicationId) {

		return _qualifedExpertAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualifedExpertAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualifedExpertAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the qualifed expert add with the primary key.
	 *
	 * @param qualifedExpertAddId the primary key of the qualifed expert add
	 * @return the qualifed expert add
	 * @throws PortalException if a qualifed expert add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
			getQualifedExpertAdd(long qualifedExpertAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertAddLocalService.getQualifedExpertAdd(
			qualifedExpertAddId);
	}

	/**
	 * Returns a range of all the qualifed expert adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert adds
	 * @param end the upper bound of the range of qualifed expert adds (not inclusive)
	 * @return the range of qualifed expert adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualifedExpertAdd>
			getQualifedExpertAdds(int start, int end) {

		return _qualifedExpertAddLocalService.getQualifedExpertAdds(start, end);
	}

	/**
	 * Returns the number of qualifed expert adds.
	 *
	 * @return the number of qualifed expert adds
	 */
	@Override
	public int getQualifedExpertAddsCount() {
		return _qualifedExpertAddLocalService.getQualifedExpertAddsCount();
	}

	/**
	 * Updates the qualifed expert add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertAdd the qualifed expert add
	 * @return the qualifed expert add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertAdd
		updateQualifedExpertAdd(
			com.nbp.hsra.application.service.model.QualifedExpertAdd
				qualifedExpertAdd) {

		return _qualifedExpertAddLocalService.updateQualifedExpertAdd(
			qualifedExpertAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualifedExpertAddLocalService.getBasePersistence();
	}

	@Override
	public QualifedExpertAddLocalService getWrappedService() {
		return _qualifedExpertAddLocalService;
	}

	@Override
	public void setWrappedService(
		QualifedExpertAddLocalService qualifedExpertAddLocalService) {

		_qualifedExpertAddLocalService = qualifedExpertAddLocalService;
	}

	private QualifedExpertAddLocalService _qualifedExpertAddLocalService;

}