/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchAlternateRsoAddException;
import com.nbp.hsra.application.service.model.AlternateRsoAdd;
import com.nbp.hsra.application.service.model.AlternateRsoAddTable;
import com.nbp.hsra.application.service.model.impl.AlternateRsoAddImpl;
import com.nbp.hsra.application.service.model.impl.AlternateRsoAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.AlternateRsoAddPersistence;
import com.nbp.hsra.application.service.service.persistence.AlternateRsoAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the alternate rso add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AlternateRsoAddPersistence.class)
public class AlternateRsoAddPersistenceImpl
	extends BasePersistenceImpl<AlternateRsoAdd>
	implements AlternateRsoAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AlternateRsoAddUtil</code> to access the alternate rso add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AlternateRsoAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of matching alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<AlternateRsoAdd> list = null;

		if (useFinderCache) {
			list = (List<AlternateRsoAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AlternateRsoAdd alternateRsoAdd : list) {
					if (hsraApplicationId !=
							alternateRsoAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_ALTERNATERSOADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AlternateRsoAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<AlternateRsoAdd>)QueryUtil.list(
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
	 * Returns the first alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a matching alternate rso add could not be found
	 */
	@Override
	public AlternateRsoAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoAdd> orderByComparator)
		throws NoSuchAlternateRsoAddException {

		AlternateRsoAdd alternateRsoAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (alternateRsoAdd != null) {
			return alternateRsoAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchAlternateRsoAddException(sb.toString());
	}

	/**
	 * Returns the first alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso add, or <code>null</code> if a matching alternate rso add could not be found
	 */
	@Override
	public AlternateRsoAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		List<AlternateRsoAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a matching alternate rso add could not be found
	 */
	@Override
	public AlternateRsoAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoAdd> orderByComparator)
		throws NoSuchAlternateRsoAddException {

		AlternateRsoAdd alternateRsoAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (alternateRsoAdd != null) {
			return alternateRsoAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchAlternateRsoAddException(sb.toString());
	}

	/**
	 * Returns the last alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso add, or <code>null</code> if a matching alternate rso add could not be found
	 */
	@Override
	public AlternateRsoAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<AlternateRsoAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the alternate rso adds before and after the current alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param alternateRsoAddId the primary key of the current alternate rso add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public AlternateRsoAdd[] findBygetHsraById_PrevAndNext(
			long alternateRsoAddId, long hsraApplicationId,
			OrderByComparator<AlternateRsoAdd> orderByComparator)
		throws NoSuchAlternateRsoAddException {

		AlternateRsoAdd alternateRsoAdd = findByPrimaryKey(alternateRsoAddId);

		Session session = null;

		try {
			session = openSession();

			AlternateRsoAdd[] array = new AlternateRsoAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, alternateRsoAdd, hsraApplicationId, orderByComparator,
				true);

			array[1] = alternateRsoAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, alternateRsoAdd, hsraApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AlternateRsoAdd getBygetHsraById_PrevAndNext(
		Session session, AlternateRsoAdd alternateRsoAdd,
		long hsraApplicationId,
		OrderByComparator<AlternateRsoAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_ALTERNATERSOADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(AlternateRsoAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						alternateRsoAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AlternateRsoAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the alternate rso adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (AlternateRsoAdd alternateRsoAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(alternateRsoAdd);
		}
	}

	/**
	 * Returns the number of alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching alternate rso adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ALTERNATERSOADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"alternateRsoAdd.hsraApplicationId = ?";

	public AlternateRsoAddPersistenceImpl() {
		setModelClass(AlternateRsoAdd.class);

		setModelImplClass(AlternateRsoAddImpl.class);
		setModelPKClass(long.class);

		setTable(AlternateRsoAddTable.INSTANCE);
	}

	/**
	 * Caches the alternate rso add in the entity cache if it is enabled.
	 *
	 * @param alternateRsoAdd the alternate rso add
	 */
	@Override
	public void cacheResult(AlternateRsoAdd alternateRsoAdd) {
		entityCache.putResult(
			AlternateRsoAddImpl.class, alternateRsoAdd.getPrimaryKey(),
			alternateRsoAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the alternate rso adds in the entity cache if it is enabled.
	 *
	 * @param alternateRsoAdds the alternate rso adds
	 */
	@Override
	public void cacheResult(List<AlternateRsoAdd> alternateRsoAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (alternateRsoAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AlternateRsoAdd alternateRsoAdd : alternateRsoAdds) {
			if (entityCache.getResult(
					AlternateRsoAddImpl.class,
					alternateRsoAdd.getPrimaryKey()) == null) {

				cacheResult(alternateRsoAdd);
			}
		}
	}

	/**
	 * Clears the cache for all alternate rso adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AlternateRsoAddImpl.class);

		finderCache.clearCache(AlternateRsoAddImpl.class);
	}

	/**
	 * Clears the cache for the alternate rso add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AlternateRsoAdd alternateRsoAdd) {
		entityCache.removeResult(AlternateRsoAddImpl.class, alternateRsoAdd);
	}

	@Override
	public void clearCache(List<AlternateRsoAdd> alternateRsoAdds) {
		for (AlternateRsoAdd alternateRsoAdd : alternateRsoAdds) {
			entityCache.removeResult(
				AlternateRsoAddImpl.class, alternateRsoAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AlternateRsoAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AlternateRsoAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new alternate rso add with the primary key. Does not add the alternate rso add to the database.
	 *
	 * @param alternateRsoAddId the primary key for the new alternate rso add
	 * @return the new alternate rso add
	 */
	@Override
	public AlternateRsoAdd create(long alternateRsoAddId) {
		AlternateRsoAdd alternateRsoAdd = new AlternateRsoAddImpl();

		alternateRsoAdd.setNew(true);
		alternateRsoAdd.setPrimaryKey(alternateRsoAddId);

		alternateRsoAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return alternateRsoAdd;
	}

	/**
	 * Removes the alternate rso add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add that was removed
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public AlternateRsoAdd remove(long alternateRsoAddId)
		throws NoSuchAlternateRsoAddException {

		return remove((Serializable)alternateRsoAddId);
	}

	/**
	 * Removes the alternate rso add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the alternate rso add
	 * @return the alternate rso add that was removed
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public AlternateRsoAdd remove(Serializable primaryKey)
		throws NoSuchAlternateRsoAddException {

		Session session = null;

		try {
			session = openSession();

			AlternateRsoAdd alternateRsoAdd = (AlternateRsoAdd)session.get(
				AlternateRsoAddImpl.class, primaryKey);

			if (alternateRsoAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAlternateRsoAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(alternateRsoAdd);
		}
		catch (NoSuchAlternateRsoAddException noSuchEntityException) {
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
	protected AlternateRsoAdd removeImpl(AlternateRsoAdd alternateRsoAdd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(alternateRsoAdd)) {
				alternateRsoAdd = (AlternateRsoAdd)session.get(
					AlternateRsoAddImpl.class,
					alternateRsoAdd.getPrimaryKeyObj());
			}

			if (alternateRsoAdd != null) {
				session.delete(alternateRsoAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (alternateRsoAdd != null) {
			clearCache(alternateRsoAdd);
		}

		return alternateRsoAdd;
	}

	@Override
	public AlternateRsoAdd updateImpl(AlternateRsoAdd alternateRsoAdd) {
		boolean isNew = alternateRsoAdd.isNew();

		if (!(alternateRsoAdd instanceof AlternateRsoAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(alternateRsoAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					alternateRsoAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in alternateRsoAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AlternateRsoAdd implementation " +
					alternateRsoAdd.getClass());
		}

		AlternateRsoAddModelImpl alternateRsoAddModelImpl =
			(AlternateRsoAddModelImpl)alternateRsoAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (alternateRsoAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				alternateRsoAdd.setCreateDate(date);
			}
			else {
				alternateRsoAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!alternateRsoAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				alternateRsoAdd.setModifiedDate(date);
			}
			else {
				alternateRsoAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(alternateRsoAdd);
			}
			else {
				alternateRsoAdd = (AlternateRsoAdd)session.merge(
					alternateRsoAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AlternateRsoAddImpl.class, alternateRsoAddModelImpl, false, true);

		if (isNew) {
			alternateRsoAdd.setNew(false);
		}

		alternateRsoAdd.resetOriginalValues();

		return alternateRsoAdd;
	}

	/**
	 * Returns the alternate rso add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the alternate rso add
	 * @return the alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public AlternateRsoAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAlternateRsoAddException {

		AlternateRsoAdd alternateRsoAdd = fetchByPrimaryKey(primaryKey);

		if (alternateRsoAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAlternateRsoAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return alternateRsoAdd;
	}

	/**
	 * Returns the alternate rso add with the primary key or throws a <code>NoSuchAlternateRsoAddException</code> if it could not be found.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	@Override
	public AlternateRsoAdd findByPrimaryKey(long alternateRsoAddId)
		throws NoSuchAlternateRsoAddException {

		return findByPrimaryKey((Serializable)alternateRsoAddId);
	}

	/**
	 * Returns the alternate rso add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add, or <code>null</code> if a alternate rso add with the primary key could not be found
	 */
	@Override
	public AlternateRsoAdd fetchByPrimaryKey(long alternateRsoAddId) {
		return fetchByPrimaryKey((Serializable)alternateRsoAddId);
	}

	/**
	 * Returns all the alternate rso adds.
	 *
	 * @return the alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of alternate rso adds
	 */
	@Override
	public List<AlternateRsoAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator,
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

		List<AlternateRsoAdd> list = null;

		if (useFinderCache) {
			list = (List<AlternateRsoAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ALTERNATERSOADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ALTERNATERSOADD;

				sql = sql.concat(AlternateRsoAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AlternateRsoAdd>)QueryUtil.list(
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
	 * Removes all the alternate rso adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AlternateRsoAdd alternateRsoAdd : findAll()) {
			remove(alternateRsoAdd);
		}
	}

	/**
	 * Returns the number of alternate rso adds.
	 *
	 * @return the number of alternate rso adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ALTERNATERSOADD);

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
		return "alternateRsoAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ALTERNATERSOADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AlternateRsoAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the alternate rso add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		AlternateRsoAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AlternateRsoAddUtil.setPersistence(null);

		entityCache.removeCache(AlternateRsoAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ALTERNATERSOADD =
		"SELECT alternateRsoAdd FROM AlternateRsoAdd alternateRsoAdd";

	private static final String _SQL_SELECT_ALTERNATERSOADD_WHERE =
		"SELECT alternateRsoAdd FROM AlternateRsoAdd alternateRsoAdd WHERE ";

	private static final String _SQL_COUNT_ALTERNATERSOADD =
		"SELECT COUNT(alternateRsoAdd) FROM AlternateRsoAdd alternateRsoAdd";

	private static final String _SQL_COUNT_ALTERNATERSOADD_WHERE =
		"SELECT COUNT(alternateRsoAdd) FROM AlternateRsoAdd alternateRsoAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "alternateRsoAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AlternateRsoAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AlternateRsoAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AlternateRsoAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}