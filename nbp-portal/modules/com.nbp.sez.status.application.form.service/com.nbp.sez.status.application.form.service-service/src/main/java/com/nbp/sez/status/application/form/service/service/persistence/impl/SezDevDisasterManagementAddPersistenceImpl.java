/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevDisasterManagementAddException;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevDisasterManagementAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevDisasterManagementAddUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev disaster management add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevDisasterManagementAddPersistence.class)
public class SezDevDisasterManagementAddPersistenceImpl
	extends BasePersistenceImpl<SezDevDisasterManagementAdd>
	implements SezDevDisasterManagementAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevDisasterManagementAddUtil</code> to access the sez dev disaster management add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevDisasterManagementAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @return the range of matching sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezDevDisasterManagementAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevDisasterManagementAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevDisasterManagementAdd sezDevDisasterManagementAdd :
						list) {

					if (sezStatusApplicationId !=
							sezDevDisasterManagementAdd.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevDisasterManagementAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevDisasterManagementAdd>)QueryUtil.list(
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
	 * Returns the first sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a matching sez dev disaster management add could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevDisasterManagementAdd> orderByComparator)
		throws NoSuchSezDevDisasterManagementAddException {

		SezDevDisasterManagementAdd sezDevDisasterManagementAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevDisasterManagementAdd != null) {
			return sezDevDisasterManagementAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevDisasterManagementAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev disaster management add, or <code>null</code> if a matching sez dev disaster management add could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator) {

		List<SezDevDisasterManagementAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a matching sez dev disaster management add could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevDisasterManagementAdd> orderByComparator)
		throws NoSuchSezDevDisasterManagementAddException {

		SezDevDisasterManagementAdd sezDevDisasterManagementAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevDisasterManagementAdd != null) {
			return sezDevDisasterManagementAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevDisasterManagementAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev disaster management add, or <code>null</code> if a matching sez dev disaster management add could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevDisasterManagementAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev disaster management adds before and after the current sez dev disaster management add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the current sez dev disaster management add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevDisasterManagementAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevDisasterManagementAdd> orderByComparator)
		throws NoSuchSezDevDisasterManagementAddException {

		SezDevDisasterManagementAdd sezDevDisasterManagementAdd =
			findByPrimaryKey(sezDevDisasterManagementAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevDisasterManagementAdd[] array =
				new SezDevDisasterManagementAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevDisasterManagementAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevDisasterManagementAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevDisasterManagementAdd, sezStatusApplicationId,
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

	protected SezDevDisasterManagementAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezDevDisasterManagementAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezDevDisasterManagementAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevDisasterManagementAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev disaster management adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevDisasterManagementAdd sezDevDisasterManagementAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevDisasterManagementAdd);
		}
	}

	/**
	 * Returns the number of sez dev disaster management adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev disaster management adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVDISASTERMANAGEMENTADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevDisasterManagementAdd.sezStatusApplicationId = ?";

	public SezDevDisasterManagementAddPersistenceImpl() {
		setModelClass(SezDevDisasterManagementAdd.class);

		setModelImplClass(SezDevDisasterManagementAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevDisasterManagementAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev disaster management add in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagementAdd the sez dev disaster management add
	 */
	@Override
	public void cacheResult(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		entityCache.putResult(
			SezDevDisasterManagementAddImpl.class,
			sezDevDisasterManagementAdd.getPrimaryKey(),
			sezDevDisasterManagementAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev disaster management adds in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagementAdds the sez dev disaster management adds
	 */
	@Override
	public void cacheResult(
		List<SezDevDisasterManagementAdd> sezDevDisasterManagementAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevDisasterManagementAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevDisasterManagementAdd sezDevDisasterManagementAdd :
				sezDevDisasterManagementAdds) {

			if (entityCache.getResult(
					SezDevDisasterManagementAddImpl.class,
					sezDevDisasterManagementAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevDisasterManagementAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev disaster management adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevDisasterManagementAddImpl.class);

		finderCache.clearCache(SezDevDisasterManagementAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev disaster management add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		entityCache.removeResult(
			SezDevDisasterManagementAddImpl.class, sezDevDisasterManagementAdd);
	}

	@Override
	public void clearCache(
		List<SezDevDisasterManagementAdd> sezDevDisasterManagementAdds) {

		for (SezDevDisasterManagementAdd sezDevDisasterManagementAdd :
				sezDevDisasterManagementAdds) {

			entityCache.removeResult(
				SezDevDisasterManagementAddImpl.class,
				sezDevDisasterManagementAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevDisasterManagementAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevDisasterManagementAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev disaster management add with the primary key. Does not add the sez dev disaster management add to the database.
	 *
	 * @param sezDevDisasterManagementAddId the primary key for the new sez dev disaster management add
	 * @return the new sez dev disaster management add
	 */
	@Override
	public SezDevDisasterManagementAdd create(
		long sezDevDisasterManagementAddId) {

		SezDevDisasterManagementAdd sezDevDisasterManagementAdd =
			new SezDevDisasterManagementAddImpl();

		sezDevDisasterManagementAdd.setNew(true);
		sezDevDisasterManagementAdd.setPrimaryKey(
			sezDevDisasterManagementAddId);

		sezDevDisasterManagementAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevDisasterManagementAdd;
	}

	/**
	 * Removes the sez dev disaster management add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add that was removed
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd remove(
			long sezDevDisasterManagementAddId)
		throws NoSuchSezDevDisasterManagementAddException {

		return remove((Serializable)sezDevDisasterManagementAddId);
	}

	/**
	 * Removes the sez dev disaster management add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add that was removed
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd remove(Serializable primaryKey)
		throws NoSuchSezDevDisasterManagementAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevDisasterManagementAdd sezDevDisasterManagementAdd =
				(SezDevDisasterManagementAdd)session.get(
					SezDevDisasterManagementAddImpl.class, primaryKey);

			if (sezDevDisasterManagementAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevDisasterManagementAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevDisasterManagementAdd);
		}
		catch (NoSuchSezDevDisasterManagementAddException
					noSuchEntityException) {

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
	protected SezDevDisasterManagementAdd removeImpl(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevDisasterManagementAdd)) {
				sezDevDisasterManagementAdd =
					(SezDevDisasterManagementAdd)session.get(
						SezDevDisasterManagementAddImpl.class,
						sezDevDisasterManagementAdd.getPrimaryKeyObj());
			}

			if (sezDevDisasterManagementAdd != null) {
				session.delete(sezDevDisasterManagementAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevDisasterManagementAdd != null) {
			clearCache(sezDevDisasterManagementAdd);
		}

		return sezDevDisasterManagementAdd;
	}

	@Override
	public SezDevDisasterManagementAdd updateImpl(
		SezDevDisasterManagementAdd sezDevDisasterManagementAdd) {

		boolean isNew = sezDevDisasterManagementAdd.isNew();

		if (!(sezDevDisasterManagementAdd instanceof
				SezDevDisasterManagementAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezDevDisasterManagementAdd.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevDisasterManagementAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevDisasterManagementAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevDisasterManagementAdd implementation " +
					sezDevDisasterManagementAdd.getClass());
		}

		SezDevDisasterManagementAddModelImpl
			sezDevDisasterManagementAddModelImpl =
				(SezDevDisasterManagementAddModelImpl)
					sezDevDisasterManagementAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevDisasterManagementAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevDisasterManagementAdd.setCreateDate(date);
			}
			else {
				sezDevDisasterManagementAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevDisasterManagementAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevDisasterManagementAdd.setModifiedDate(date);
			}
			else {
				sezDevDisasterManagementAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevDisasterManagementAdd);
			}
			else {
				sezDevDisasterManagementAdd =
					(SezDevDisasterManagementAdd)session.merge(
						sezDevDisasterManagementAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevDisasterManagementAddImpl.class,
			sezDevDisasterManagementAddModelImpl, false, true);

		if (isNew) {
			sezDevDisasterManagementAdd.setNew(false);
		}

		sezDevDisasterManagementAdd.resetOriginalValues();

		return sezDevDisasterManagementAdd;
	}

	/**
	 * Returns the sez dev disaster management add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevDisasterManagementAddException {

		SezDevDisasterManagementAdd sezDevDisasterManagementAdd =
			fetchByPrimaryKey(primaryKey);

		if (sezDevDisasterManagementAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevDisasterManagementAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevDisasterManagementAdd;
	}

	/**
	 * Returns the sez dev disaster management add with the primary key or throws a <code>NoSuchSezDevDisasterManagementAddException</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add
	 * @throws NoSuchSezDevDisasterManagementAddException if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd findByPrimaryKey(
			long sezDevDisasterManagementAddId)
		throws NoSuchSezDevDisasterManagementAddException {

		return findByPrimaryKey((Serializable)sezDevDisasterManagementAddId);
	}

	/**
	 * Returns the sez dev disaster management add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementAddId the primary key of the sez dev disaster management add
	 * @return the sez dev disaster management add, or <code>null</code> if a sez dev disaster management add with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagementAdd fetchByPrimaryKey(
		long sezDevDisasterManagementAddId) {

		return fetchByPrimaryKey((Serializable)sezDevDisasterManagementAddId);
	}

	/**
	 * Returns all the sez dev disaster management adds.
	 *
	 * @return the sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @return the range of sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster management adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster management adds
	 * @param end the upper bound of the range of sez dev disaster management adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev disaster management adds
	 */
	@Override
	public List<SezDevDisasterManagementAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevDisasterManagementAdd> orderByComparator,
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

		List<SezDevDisasterManagementAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevDisasterManagementAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD;

				sql = sql.concat(
					SezDevDisasterManagementAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevDisasterManagementAdd>)QueryUtil.list(
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
	 * Removes all the sez dev disaster management adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevDisasterManagementAdd sezDevDisasterManagementAdd :
				findAll()) {

			remove(sezDevDisasterManagementAdd);
		}
	}

	/**
	 * Returns the number of sez dev disaster management adds.
	 *
	 * @return the number of sez dev disaster management adds
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
					_SQL_COUNT_SEZDEVDISASTERMANAGEMENTADD);

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
		return "sezDevDisasterManagementAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevDisasterManagementAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev disaster management add persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevDisasterManagementAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevDisasterManagementAddUtil.setPersistence(null);

		entityCache.removeCache(
			SezDevDisasterManagementAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD =
		"SELECT sezDevDisasterManagementAdd FROM SezDevDisasterManagementAdd sezDevDisasterManagementAdd";

	private static final String _SQL_SELECT_SEZDEVDISASTERMANAGEMENTADD_WHERE =
		"SELECT sezDevDisasterManagementAdd FROM SezDevDisasterManagementAdd sezDevDisasterManagementAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVDISASTERMANAGEMENTADD =
		"SELECT COUNT(sezDevDisasterManagementAdd) FROM SezDevDisasterManagementAdd sezDevDisasterManagementAdd";

	private static final String _SQL_COUNT_SEZDEVDISASTERMANAGEMENTADD_WHERE =
		"SELECT COUNT(sezDevDisasterManagementAdd) FROM SezDevDisasterManagementAdd sezDevDisasterManagementAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevDisasterManagementAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevDisasterManagementAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevDisasterManagementAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevDisasterManagementAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}