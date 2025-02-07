/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingRecommendationToJCAException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manufacturing recommendation to jca service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCAUtil
 * @generated
 */
@ProviderType
public interface ManufacturingRecommendationToJCAPersistence
	extends BasePersistence<ManufacturingRecommendationToJCA> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManufacturingRecommendationToJCAUtil} to access the manufacturing recommendation to jca persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or throws a <code>NoSuchManufacturingRecommendationToJCAException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a matching manufacturing recommendation to jca could not be found
	 */
	public ManufacturingRecommendationToJCA findBygetManuFacturingBy_CaseId(
			String caseId)
		throws NoSuchManufacturingRecommendationToJCAException;

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing recommendation to jca, or <code>null</code> if a matching manufacturing recommendation to jca could not be found
	 */
	public ManufacturingRecommendationToJCA fetchBygetManuFacturingBy_CaseId(
		String caseId);

	/**
	 * Returns the manufacturing recommendation to jca where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing recommendation to jca, or <code>null</code> if a matching manufacturing recommendation to jca could not be found
	 */
	public ManufacturingRecommendationToJCA fetchBygetManuFacturingBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the manufacturing recommendation to jca where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing recommendation to jca that was removed
	 */
	public ManufacturingRecommendationToJCA removeBygetManuFacturingBy_CaseId(
			String caseId)
		throws NoSuchManufacturingRecommendationToJCAException;

	/**
	 * Returns the number of manufacturing recommendation to jcas where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing recommendation to jcas
	 */
	public int countBygetManuFacturingBy_CaseId(String caseId);

	/**
	 * Caches the manufacturing recommendation to jca in the entity cache if it is enabled.
	 *
	 * @param manufacturingRecommendationToJCA the manufacturing recommendation to jca
	 */
	public void cacheResult(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA);

	/**
	 * Caches the manufacturing recommendation to jcas in the entity cache if it is enabled.
	 *
	 * @param manufacturingRecommendationToJCAs the manufacturing recommendation to jcas
	 */
	public void cacheResult(
		java.util.List<ManufacturingRecommendationToJCA>
			manufacturingRecommendationToJCAs);

	/**
	 * Creates a new manufacturing recommendation to jca with the primary key. Does not add the manufacturing recommendation to jca to the database.
	 *
	 * @param manufacturingJCAId the primary key for the new manufacturing recommendation to jca
	 * @return the new manufacturing recommendation to jca
	 */
	public ManufacturingRecommendationToJCA create(long manufacturingJCAId);

	/**
	 * Removes the manufacturing recommendation to jca with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca that was removed
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public ManufacturingRecommendationToJCA remove(long manufacturingJCAId)
		throws NoSuchManufacturingRecommendationToJCAException;

	public ManufacturingRecommendationToJCA updateImpl(
		ManufacturingRecommendationToJCA manufacturingRecommendationToJCA);

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or throws a <code>NoSuchManufacturingRecommendationToJCAException</code> if it could not be found.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca
	 * @throws NoSuchManufacturingRecommendationToJCAException if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public ManufacturingRecommendationToJCA findByPrimaryKey(
			long manufacturingJCAId)
		throws NoSuchManufacturingRecommendationToJCAException;

	/**
	 * Returns the manufacturing recommendation to jca with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingJCAId the primary key of the manufacturing recommendation to jca
	 * @return the manufacturing recommendation to jca, or <code>null</code> if a manufacturing recommendation to jca with the primary key could not be found
	 */
	public ManufacturingRecommendationToJCA fetchByPrimaryKey(
		long manufacturingJCAId);

	/**
	 * Returns all the manufacturing recommendation to jcas.
	 *
	 * @return the manufacturing recommendation to jcas
	 */
	public java.util.List<ManufacturingRecommendationToJCA> findAll();

	/**
	 * Returns a range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @return the range of manufacturing recommendation to jcas
	 */
	public java.util.List<ManufacturingRecommendationToJCA> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing recommendation to jcas
	 */
	public java.util.List<ManufacturingRecommendationToJCA> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingRecommendationToJCA> orderByComparator);

	/**
	 * Returns an ordered range of all the manufacturing recommendation to jcas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingRecommendationToJCAModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing recommendation to jcas
	 * @param end the upper bound of the range of manufacturing recommendation to jcas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing recommendation to jcas
	 */
	public java.util.List<ManufacturingRecommendationToJCA> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManufacturingRecommendationToJCA> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manufacturing recommendation to jcas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manufacturing recommendation to jcas.
	 *
	 * @return the number of manufacturing recommendation to jcas
	 */
	public int countAll();

}