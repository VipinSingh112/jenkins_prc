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

import com.nbp.hsra.application.service.exception.NoSuchAlternateRsoOneAddException;
import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;
import com.nbp.hsra.application.service.model.AlternateRsoOneAddTable;
import com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddImpl;
import com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.AlternateRsoOneAddPersistence;
import com.nbp.hsra.application.service.service.persistence.AlternateRsoOneAddUtil;
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
 * The persistence implementation for the alternate rso one add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AlternateRsoOneAddPersistence.class)
public class AlternateRsoOneAddPersistenceImpl
	extends BasePersistenceImpl<AlternateRsoOneAdd>
	implements AlternateRsoOneAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AlternateRsoOneAddUtil</code> to access the alternate rso one add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AlternateRsoOneAddImpl.class.getName();

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
	 * Returns all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of matching alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator,
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

		List<AlternateRsoOneAdd> list = null;

		if (useFinderCache) {
			list = (List<AlternateRsoOneAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AlternateRsoOneAdd alternateRsoOneAdd : list) {
					if (hsraApplicationId !=
							alternateRsoOneAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_ALTERNATERSOONEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AlternateRsoOneAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<AlternateRsoOneAdd>)QueryUtil.list(
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
	 * Returns the first alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a matching alternate rso one add could not be found
	 */
	@Override
	public AlternateRsoOneAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoOneAdd> orderByComparator)
		throws NoSuchAlternateRsoOneAddException {

		AlternateRsoOneAdd alternateRsoOneAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (alternateRsoOneAdd != null) {
			return alternateRsoOneAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchAlternateRsoOneAddException(sb.toString());
	}

	/**
	 * Returns the first alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso one add, or <code>null</code> if a matching alternate rso one add could not be found
	 */
	@Override
	public AlternateRsoOneAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		List<AlternateRsoOneAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a matching alternate rso one add could not be found
	 */
	@Override
	public AlternateRsoOneAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoOneAdd> orderByComparator)
		throws NoSuchAlternateRsoOneAddException {

		AlternateRsoOneAdd alternateRsoOneAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (alternateRsoOneAdd != null) {
			return alternateRsoOneAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchAlternateRsoOneAddException(sb.toString());
	}

	/**
	 * Returns the last alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso one add, or <code>null</code> if a matching alternate rso one add could not be found
	 */
	@Override
	public AlternateRsoOneAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<AlternateRsoOneAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the alternate rso one adds before and after the current alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param alternateRsoOneAddId the primary key of the current alternate rso one add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public AlternateRsoOneAdd[] findBygetHsraById_PrevAndNext(
			long alternateRsoOneAddId, long hsraApplicationId,
			OrderByComparator<AlternateRsoOneAdd> orderByComparator)
		throws NoSuchAlternateRsoOneAddException {

		AlternateRsoOneAdd alternateRsoOneAdd = findByPrimaryKey(
			alternateRsoOneAddId);

		Session session = null;

		try {
			session = openSession();

			AlternateRsoOneAdd[] array = new AlternateRsoOneAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, alternateRsoOneAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = alternateRsoOneAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, alternateRsoOneAdd, hsraApplicationId,
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

	protected AlternateRsoOneAdd getBygetHsraById_PrevAndNext(
		Session session, AlternateRsoOneAdd alternateRsoOneAdd,
		long hsraApplicationId,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_ALTERNATERSOONEADD_WHERE);

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
			sb.append(AlternateRsoOneAddModelImpl.ORDER_BY_JPQL);
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
						alternateRsoOneAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AlternateRsoOneAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the alternate rso one adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (AlternateRsoOneAdd alternateRsoOneAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(alternateRsoOneAdd);
		}
	}

	/**
	 * Returns the number of alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching alternate rso one adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ALTERNATERSOONEADD_WHERE);

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
		"alternateRsoOneAdd.hsraApplicationId = ?";

	public AlternateRsoOneAddPersistenceImpl() {
		setModelClass(AlternateRsoOneAdd.class);

		setModelImplClass(AlternateRsoOneAddImpl.class);
		setModelPKClass(long.class);

		setTable(AlternateRsoOneAddTable.INSTANCE);
	}

	/**
	 * Caches the alternate rso one add in the entity cache if it is enabled.
	 *
	 * @param alternateRsoOneAdd the alternate rso one add
	 */
	@Override
	public void cacheResult(AlternateRsoOneAdd alternateRsoOneAdd) {
		entityCache.putResult(
			AlternateRsoOneAddImpl.class, alternateRsoOneAdd.getPrimaryKey(),
			alternateRsoOneAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the alternate rso one adds in the entity cache if it is enabled.
	 *
	 * @param alternateRsoOneAdds the alternate rso one adds
	 */
	@Override
	public void cacheResult(List<AlternateRsoOneAdd> alternateRsoOneAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (alternateRsoOneAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AlternateRsoOneAdd alternateRsoOneAdd : alternateRsoOneAdds) {
			if (entityCache.getResult(
					AlternateRsoOneAddImpl.class,
					alternateRsoOneAdd.getPrimaryKey()) == null) {

				cacheResult(alternateRsoOneAdd);
			}
		}
	}

	/**
	 * Clears the cache for all alternate rso one adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AlternateRsoOneAddImpl.class);

		finderCache.clearCache(AlternateRsoOneAddImpl.class);
	}

	/**
	 * Clears the cache for the alternate rso one add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AlternateRsoOneAdd alternateRsoOneAdd) {
		entityCache.removeResult(
			AlternateRsoOneAddImpl.class, alternateRsoOneAdd);
	}

	@Override
	public void clearCache(List<AlternateRsoOneAdd> alternateRsoOneAdds) {
		for (AlternateRsoOneAdd alternateRsoOneAdd : alternateRsoOneAdds) {
			entityCache.removeResult(
				AlternateRsoOneAddImpl.class, alternateRsoOneAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AlternateRsoOneAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AlternateRsoOneAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new alternate rso one add with the primary key. Does not add the alternate rso one add to the database.
	 *
	 * @param alternateRsoOneAddId the primary key for the new alternate rso one add
	 * @return the new alternate rso one add
	 */
	@Override
	public AlternateRsoOneAdd create(long alternateRsoOneAddId) {
		AlternateRsoOneAdd alternateRsoOneAdd = new AlternateRsoOneAddImpl();

		alternateRsoOneAdd.setNew(true);
		alternateRsoOneAdd.setPrimaryKey(alternateRsoOneAddId);

		alternateRsoOneAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return alternateRsoOneAdd;
	}

	/**
	 * Removes the alternate rso one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add that was removed
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public AlternateRsoOneAdd remove(long alternateRsoOneAddId)
		throws NoSuchAlternateRsoOneAddException {

		return remove((Serializable)alternateRsoOneAddId);
	}

	/**
	 * Removes the alternate rso one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the alternate rso one add
	 * @return the alternate rso one add that was removed
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public AlternateRsoOneAdd remove(Serializable primaryKey)
		throws NoSuchAlternateRsoOneAddException {

		Session session = null;

		try {
			session = openSession();

			AlternateRsoOneAdd alternateRsoOneAdd =
				(AlternateRsoOneAdd)session.get(
					AlternateRsoOneAddImpl.class, primaryKey);

			if (alternateRsoOneAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAlternateRsoOneAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(alternateRsoOneAdd);
		}
		catch (NoSuchAlternateRsoOneAddException noSuchEntityException) {
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
	protected AlternateRsoOneAdd removeImpl(
		AlternateRsoOneAdd alternateRsoOneAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(alternateRsoOneAdd)) {
				alternateRsoOneAdd = (AlternateRsoOneAdd)session.get(
					AlternateRsoOneAddImpl.class,
					alternateRsoOneAdd.getPrimaryKeyObj());
			}

			if (alternateRsoOneAdd != null) {
				session.delete(alternateRsoOneAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (alternateRsoOneAdd != null) {
			clearCache(alternateRsoOneAdd);
		}

		return alternateRsoOneAdd;
	}

	@Override
	public AlternateRsoOneAdd updateImpl(
		AlternateRsoOneAdd alternateRsoOneAdd) {

		boolean isNew = alternateRsoOneAdd.isNew();

		if (!(alternateRsoOneAdd instanceof AlternateRsoOneAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(alternateRsoOneAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					alternateRsoOneAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in alternateRsoOneAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AlternateRsoOneAdd implementation " +
					alternateRsoOneAdd.getClass());
		}

		AlternateRsoOneAddModelImpl alternateRsoOneAddModelImpl =
			(AlternateRsoOneAddModelImpl)alternateRsoOneAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (alternateRsoOneAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				alternateRsoOneAdd.setCreateDate(date);
			}
			else {
				alternateRsoOneAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!alternateRsoOneAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				alternateRsoOneAdd.setModifiedDate(date);
			}
			else {
				alternateRsoOneAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(alternateRsoOneAdd);
			}
			else {
				alternateRsoOneAdd = (AlternateRsoOneAdd)session.merge(
					alternateRsoOneAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AlternateRsoOneAddImpl.class, alternateRsoOneAddModelImpl, false,
			true);

		if (isNew) {
			alternateRsoOneAdd.setNew(false);
		}

		alternateRsoOneAdd.resetOriginalValues();

		return alternateRsoOneAdd;
	}

	/**
	 * Returns the alternate rso one add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the alternate rso one add
	 * @return the alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public AlternateRsoOneAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAlternateRsoOneAddException {

		AlternateRsoOneAdd alternateRsoOneAdd = fetchByPrimaryKey(primaryKey);

		if (alternateRsoOneAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAlternateRsoOneAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return alternateRsoOneAdd;
	}

	/**
	 * Returns the alternate rso one add with the primary key or throws a <code>NoSuchAlternateRsoOneAddException</code> if it could not be found.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public AlternateRsoOneAdd findByPrimaryKey(long alternateRsoOneAddId)
		throws NoSuchAlternateRsoOneAddException {

		return findByPrimaryKey((Serializable)alternateRsoOneAddId);
	}

	/**
	 * Returns the alternate rso one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add, or <code>null</code> if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public AlternateRsoOneAdd fetchByPrimaryKey(long alternateRsoOneAddId) {
		return fetchByPrimaryKey((Serializable)alternateRsoOneAddId);
	}

	/**
	 * Returns all the alternate rso one adds.
	 *
	 * @return the alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of alternate rso one adds
	 */
	@Override
	public List<AlternateRsoOneAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator,
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

		List<AlternateRsoOneAdd> list = null;

		if (useFinderCache) {
			list = (List<AlternateRsoOneAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ALTERNATERSOONEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ALTERNATERSOONEADD;

				sql = sql.concat(AlternateRsoOneAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AlternateRsoOneAdd>)QueryUtil.list(
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
	 * Removes all the alternate rso one adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AlternateRsoOneAdd alternateRsoOneAdd : findAll()) {
			remove(alternateRsoOneAdd);
		}
	}

	/**
	 * Returns the number of alternate rso one adds.
	 *
	 * @return the number of alternate rso one adds
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
					_SQL_COUNT_ALTERNATERSOONEADD);

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
		return "alternateRsoOneAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ALTERNATERSOONEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AlternateRsoOneAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the alternate rso one add persistence.
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

		AlternateRsoOneAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AlternateRsoOneAddUtil.setPersistence(null);

		entityCache.removeCache(AlternateRsoOneAddImpl.class.getName());
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

	private static final String _SQL_SELECT_ALTERNATERSOONEADD =
		"SELECT alternateRsoOneAdd FROM AlternateRsoOneAdd alternateRsoOneAdd";

	private static final String _SQL_SELECT_ALTERNATERSOONEADD_WHERE =
		"SELECT alternateRsoOneAdd FROM AlternateRsoOneAdd alternateRsoOneAdd WHERE ";

	private static final String _SQL_COUNT_ALTERNATERSOONEADD =
		"SELECT COUNT(alternateRsoOneAdd) FROM AlternateRsoOneAdd alternateRsoOneAdd";

	private static final String _SQL_COUNT_ALTERNATERSOONEADD_WHERE =
		"SELECT COUNT(alternateRsoOneAdd) FROM AlternateRsoOneAdd alternateRsoOneAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "alternateRsoOneAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AlternateRsoOneAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AlternateRsoOneAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AlternateRsoOneAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}