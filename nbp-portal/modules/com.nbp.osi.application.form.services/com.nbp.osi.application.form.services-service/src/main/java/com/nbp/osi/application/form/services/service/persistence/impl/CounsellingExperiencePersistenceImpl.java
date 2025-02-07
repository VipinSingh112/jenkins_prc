/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.osi.application.form.services.exception.NoSuchCounsellingExperienceException;
import com.nbp.osi.application.form.services.model.CounsellingExperience;
import com.nbp.osi.application.form.services.model.CounsellingExperienceTable;
import com.nbp.osi.application.form.services.model.impl.CounsellingExperienceImpl;
import com.nbp.osi.application.form.services.model.impl.CounsellingExperienceModelImpl;
import com.nbp.osi.application.form.services.service.persistence.CounsellingExperiencePersistence;
import com.nbp.osi.application.form.services.service.persistence.CounsellingExperienceUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the counselling experience service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CounsellingExperiencePersistence.class)
public class CounsellingExperiencePersistenceImpl
	extends BasePersistenceImpl<CounsellingExperience>
	implements CounsellingExperiencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CounsellingExperienceUtil</code> to access the counselling experience persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CounsellingExperienceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findBygetOsiById(long osiApplicationId) {
		return findBygetOsiById(
			osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of matching counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end) {

		return findBygetOsiById(osiApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return findBygetOsiById(
			osiApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiApplicationId, start, end, orderByComparator
			};
		}

		List<CounsellingExperience> list = null;

		if (useFinderCache) {
			list = (List<CounsellingExperience>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CounsellingExperience counsellingExperience : list) {
					if (osiApplicationId !=
							counsellingExperience.getOsiApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_COUNSELLINGEXPERIENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CounsellingExperienceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				list = (List<CounsellingExperience>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counselling experience
	 * @throws NoSuchCounsellingExperienceException if a matching counselling experience could not be found
	 */
	@Override
	public CounsellingExperience findBygetOsiById_First(
			long osiApplicationId,
			OrderByComparator<CounsellingExperience> orderByComparator)
		throws NoSuchCounsellingExperienceException {

		CounsellingExperience counsellingExperience = fetchBygetOsiById_First(
			osiApplicationId, orderByComparator);

		if (counsellingExperience != null) {
			return counsellingExperience;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchCounsellingExperienceException(sb.toString());
	}

	/**
	 * Returns the first counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counselling experience, or <code>null</code> if a matching counselling experience could not be found
	 */
	@Override
	public CounsellingExperience fetchBygetOsiById_First(
		long osiApplicationId,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		List<CounsellingExperience> list = findBygetOsiById(
			osiApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counselling experience
	 * @throws NoSuchCounsellingExperienceException if a matching counselling experience could not be found
	 */
	@Override
	public CounsellingExperience findBygetOsiById_Last(
			long osiApplicationId,
			OrderByComparator<CounsellingExperience> orderByComparator)
		throws NoSuchCounsellingExperienceException {

		CounsellingExperience counsellingExperience = fetchBygetOsiById_Last(
			osiApplicationId, orderByComparator);

		if (counsellingExperience != null) {
			return counsellingExperience;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchCounsellingExperienceException(sb.toString());
	}

	/**
	 * Returns the last counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counselling experience, or <code>null</code> if a matching counselling experience could not be found
	 */
	@Override
	public CounsellingExperience fetchBygetOsiById_Last(
		long osiApplicationId,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		int count = countBygetOsiById(osiApplicationId);

		if (count == 0) {
			return null;
		}

		List<CounsellingExperience> list = findBygetOsiById(
			osiApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the counselling experiences before and after the current counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param counsellingExperienceId the primary key of the current counselling experience
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	@Override
	public CounsellingExperience[] findBygetOsiById_PrevAndNext(
			long counsellingExperienceId, long osiApplicationId,
			OrderByComparator<CounsellingExperience> orderByComparator)
		throws NoSuchCounsellingExperienceException {

		CounsellingExperience counsellingExperience = findByPrimaryKey(
			counsellingExperienceId);

		Session session = null;

		try {
			session = openSession();

			CounsellingExperience[] array = new CounsellingExperienceImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, counsellingExperience, osiApplicationId,
				orderByComparator, true);

			array[1] = counsellingExperience;

			array[2] = getBygetOsiById_PrevAndNext(
				session, counsellingExperience, osiApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CounsellingExperience getBygetOsiById_PrevAndNext(
		Session session, CounsellingExperience counsellingExperience,
		long osiApplicationId,
		OrderByComparator<CounsellingExperience> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_COUNSELLINGEXPERIENCE_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CounsellingExperienceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						counsellingExperience)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CounsellingExperience> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the counselling experiences where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	@Override
	public void removeBygetOsiById(long osiApplicationId) {
		for (CounsellingExperience counsellingExperience :
				findBygetOsiById(
					osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(counsellingExperience);
		}
	}

	/**
	 * Returns the number of counselling experiences where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching counselling experiences
	 */
	@Override
	public int countBygetOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_COUNSELLINGEXPERIENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2 =
		"counsellingExperience.osiApplicationId = ?";

	public CounsellingExperiencePersistenceImpl() {
		setModelClass(CounsellingExperience.class);

		setModelImplClass(CounsellingExperienceImpl.class);
		setModelPKClass(long.class);

		setTable(CounsellingExperienceTable.INSTANCE);
	}

	/**
	 * Caches the counselling experience in the entity cache if it is enabled.
	 *
	 * @param counsellingExperience the counselling experience
	 */
	@Override
	public void cacheResult(CounsellingExperience counsellingExperience) {
		entityCache.putResult(
			CounsellingExperienceImpl.class,
			counsellingExperience.getPrimaryKey(), counsellingExperience);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the counselling experiences in the entity cache if it is enabled.
	 *
	 * @param counsellingExperiences the counselling experiences
	 */
	@Override
	public void cacheResult(
		List<CounsellingExperience> counsellingExperiences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (counsellingExperiences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CounsellingExperience counsellingExperience :
				counsellingExperiences) {

			if (entityCache.getResult(
					CounsellingExperienceImpl.class,
					counsellingExperience.getPrimaryKey()) == null) {

				cacheResult(counsellingExperience);
			}
		}
	}

	/**
	 * Clears the cache for all counselling experiences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CounsellingExperienceImpl.class);

		finderCache.clearCache(CounsellingExperienceImpl.class);
	}

	/**
	 * Clears the cache for the counselling experience.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CounsellingExperience counsellingExperience) {
		entityCache.removeResult(
			CounsellingExperienceImpl.class, counsellingExperience);
	}

	@Override
	public void clearCache(List<CounsellingExperience> counsellingExperiences) {
		for (CounsellingExperience counsellingExperience :
				counsellingExperiences) {

			entityCache.removeResult(
				CounsellingExperienceImpl.class, counsellingExperience);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CounsellingExperienceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CounsellingExperienceImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new counselling experience with the primary key. Does not add the counselling experience to the database.
	 *
	 * @param counsellingExperienceId the primary key for the new counselling experience
	 * @return the new counselling experience
	 */
	@Override
	public CounsellingExperience create(long counsellingExperienceId) {
		CounsellingExperience counsellingExperience =
			new CounsellingExperienceImpl();

		counsellingExperience.setNew(true);
		counsellingExperience.setPrimaryKey(counsellingExperienceId);

		counsellingExperience.setCompanyId(CompanyThreadLocal.getCompanyId());

		return counsellingExperience;
	}

	/**
	 * Removes the counselling experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience that was removed
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	@Override
	public CounsellingExperience remove(long counsellingExperienceId)
		throws NoSuchCounsellingExperienceException {

		return remove((Serializable)counsellingExperienceId);
	}

	/**
	 * Removes the counselling experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the counselling experience
	 * @return the counselling experience that was removed
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	@Override
	public CounsellingExperience remove(Serializable primaryKey)
		throws NoSuchCounsellingExperienceException {

		Session session = null;

		try {
			session = openSession();

			CounsellingExperience counsellingExperience =
				(CounsellingExperience)session.get(
					CounsellingExperienceImpl.class, primaryKey);

			if (counsellingExperience == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCounsellingExperienceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(counsellingExperience);
		}
		catch (NoSuchCounsellingExperienceException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CounsellingExperience removeImpl(
		CounsellingExperience counsellingExperience) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(counsellingExperience)) {
				counsellingExperience = (CounsellingExperience)session.get(
					CounsellingExperienceImpl.class,
					counsellingExperience.getPrimaryKeyObj());
			}

			if (counsellingExperience != null) {
				session.delete(counsellingExperience);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (counsellingExperience != null) {
			clearCache(counsellingExperience);
		}

		return counsellingExperience;
	}

	@Override
	public CounsellingExperience updateImpl(
		CounsellingExperience counsellingExperience) {

		boolean isNew = counsellingExperience.isNew();

		if (!(counsellingExperience instanceof
				CounsellingExperienceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(counsellingExperience.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					counsellingExperience);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in counsellingExperience proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CounsellingExperience implementation " +
					counsellingExperience.getClass());
		}

		CounsellingExperienceModelImpl counsellingExperienceModelImpl =
			(CounsellingExperienceModelImpl)counsellingExperience;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (counsellingExperience.getCreateDate() == null)) {
			if (serviceContext == null) {
				counsellingExperience.setCreateDate(date);
			}
			else {
				counsellingExperience.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!counsellingExperienceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				counsellingExperience.setModifiedDate(date);
			}
			else {
				counsellingExperience.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(counsellingExperience);
			}
			else {
				counsellingExperience = (CounsellingExperience)session.merge(
					counsellingExperience);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CounsellingExperienceImpl.class, counsellingExperienceModelImpl,
			false, true);

		if (isNew) {
			counsellingExperience.setNew(false);
		}

		counsellingExperience.resetOriginalValues();

		return counsellingExperience;
	}

	/**
	 * Returns the counselling experience with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the counselling experience
	 * @return the counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	@Override
	public CounsellingExperience findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCounsellingExperienceException {

		CounsellingExperience counsellingExperience = fetchByPrimaryKey(
			primaryKey);

		if (counsellingExperience == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCounsellingExperienceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return counsellingExperience;
	}

	/**
	 * Returns the counselling experience with the primary key or throws a <code>NoSuchCounsellingExperienceException</code> if it could not be found.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	@Override
	public CounsellingExperience findByPrimaryKey(long counsellingExperienceId)
		throws NoSuchCounsellingExperienceException {

		return findByPrimaryKey((Serializable)counsellingExperienceId);
	}

	/**
	 * Returns the counselling experience with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience, or <code>null</code> if a counselling experience with the primary key could not be found
	 */
	@Override
	public CounsellingExperience fetchByPrimaryKey(
		long counsellingExperienceId) {

		return fetchByPrimaryKey((Serializable)counsellingExperienceId);
	}

	/**
	 * Returns all the counselling experiences.
	 *
	 * @return the counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findAll(
		int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of counselling experiences
	 */
	@Override
	public List<CounsellingExperience> findAll(
		int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<CounsellingExperience> list = null;

		if (useFinderCache) {
			list = (List<CounsellingExperience>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_COUNSELLINGEXPERIENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_COUNSELLINGEXPERIENCE;

				sql = sql.concat(CounsellingExperienceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CounsellingExperience>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the counselling experiences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CounsellingExperience counsellingExperience : findAll()) {
			remove(counsellingExperience);
		}
	}

	/**
	 * Returns the number of counselling experiences.
	 *
	 * @return the number of counselling experiences
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_COUNSELLINGEXPERIENCE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "counsellingExperienceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_COUNSELLINGEXPERIENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CounsellingExperienceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the counselling experience persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		CounsellingExperienceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CounsellingExperienceUtil.setPersistence(null);

		entityCache.removeCache(CounsellingExperienceImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_COUNSELLINGEXPERIENCE =
		"SELECT counsellingExperience FROM CounsellingExperience counsellingExperience";

	private static final String _SQL_SELECT_COUNSELLINGEXPERIENCE_WHERE =
		"SELECT counsellingExperience FROM CounsellingExperience counsellingExperience WHERE ";

	private static final String _SQL_COUNT_COUNSELLINGEXPERIENCE =
		"SELECT COUNT(counsellingExperience) FROM CounsellingExperience counsellingExperience";

	private static final String _SQL_COUNT_COUNSELLINGEXPERIENCE_WHERE =
		"SELECT COUNT(counsellingExperience) FROM CounsellingExperience counsellingExperience WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"counsellingExperience.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CounsellingExperience exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CounsellingExperience exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CounsellingExperiencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}