/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOgtSectionBException;
import com.nbp.ogt.application.form.services.model.OgtSectionB;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt section b service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionBUtil
 * @generated
 */
@ProviderType
public interface OgtSectionBPersistence extends BasePersistence<OgtSectionB> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtSectionBUtil} to access the ogt section b persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or throws a <code>NoSuchOgtSectionBException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt section b
	 * @throws NoSuchOgtSectionBException if a matching ogt section b could not be found
	 */
	public OgtSectionB findBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtSectionBException;

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt section b, or <code>null</code> if a matching ogt section b could not be found
	 */
	public OgtSectionB fetchBygetOgtById(long ogtApplicationId);

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt section b, or <code>null</code> if a matching ogt section b could not be found
	 */
	public OgtSectionB fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt section b where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt section b that was removed
	 */
	public OgtSectionB removeBygetOgtById(long ogtApplicationId)
		throws NoSuchOgtSectionBException;

	/**
	 * Returns the number of ogt section bs where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt section bs
	 */
	public int countBygetOgtById(long ogtApplicationId);

	/**
	 * Caches the ogt section b in the entity cache if it is enabled.
	 *
	 * @param ogtSectionB the ogt section b
	 */
	public void cacheResult(OgtSectionB ogtSectionB);

	/**
	 * Caches the ogt section bs in the entity cache if it is enabled.
	 *
	 * @param ogtSectionBs the ogt section bs
	 */
	public void cacheResult(java.util.List<OgtSectionB> ogtSectionBs);

	/**
	 * Creates a new ogt section b with the primary key. Does not add the ogt section b to the database.
	 *
	 * @param ogtSectionBId the primary key for the new ogt section b
	 * @return the new ogt section b
	 */
	public OgtSectionB create(long ogtSectionBId);

	/**
	 * Removes the ogt section b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b that was removed
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	public OgtSectionB remove(long ogtSectionBId)
		throws NoSuchOgtSectionBException;

	public OgtSectionB updateImpl(OgtSectionB ogtSectionB);

	/**
	 * Returns the ogt section b with the primary key or throws a <code>NoSuchOgtSectionBException</code> if it could not be found.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	public OgtSectionB findByPrimaryKey(long ogtSectionBId)
		throws NoSuchOgtSectionBException;

	/**
	 * Returns the ogt section b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b, or <code>null</code> if a ogt section b with the primary key could not be found
	 */
	public OgtSectionB fetchByPrimaryKey(long ogtSectionBId);

	/**
	 * Returns all the ogt section bs.
	 *
	 * @return the ogt section bs
	 */
	public java.util.List<OgtSectionB> findAll();

	/**
	 * Returns a range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @return the range of ogt section bs
	 */
	public java.util.List<OgtSectionB> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt section bs
	 */
	public java.util.List<OgtSectionB> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtSectionB>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt section bs
	 */
	public java.util.List<OgtSectionB> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtSectionB>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt section bs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt section bs.
	 *
	 * @return the number of ogt section bs
	 */
	public int countAll();

}