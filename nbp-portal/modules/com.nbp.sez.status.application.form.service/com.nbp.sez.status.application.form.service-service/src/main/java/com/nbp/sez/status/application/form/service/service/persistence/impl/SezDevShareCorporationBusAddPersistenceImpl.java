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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareCorporationBusAddException;
import com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd;
import com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAddTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareCorporationBusAddImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareCorporationBusAddModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareCorporationBusAddPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareCorporationBusAddUtil;
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
 * The persistence implementation for the sez dev share corporation bus add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevShareCorporationBusAddPersistence.class)
public class SezDevShareCorporationBusAddPersistenceImpl
	extends BasePersistenceImpl<SezDevShareCorporationBusAdd>
	implements SezDevShareCorporationBusAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevShareCorporationBusAddUtil</code> to access the sez dev share corporation bus add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevShareCorporationBusAddImpl.class.getName();

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
	 * Returns all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @return the range of matching sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator,
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

		List<SezDevShareCorporationBusAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareCorporationBusAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd :
						list) {

					if (sezStatusApplicationId !=
							sezDevShareCorporationBusAdd.
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

			sb.append(_SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezDevShareCorporationBusAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezDevShareCorporationBusAdd>)QueryUtil.list(
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
	 * Returns the first sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a matching sez dev share corporation bus add could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator)
		throws NoSuchSezDevShareCorporationBusAddException {

		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezDevShareCorporationBusAdd != null) {
			return sezDevShareCorporationBusAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevShareCorporationBusAddException(sb.toString());
	}

	/**
	 * Returns the first sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez dev share corporation bus add, or <code>null</code> if a matching sez dev share corporation bus add could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator) {

		List<SezDevShareCorporationBusAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a matching sez dev share corporation bus add could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator)
		throws NoSuchSezDevShareCorporationBusAddException {

		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezDevShareCorporationBusAdd != null) {
			return sezDevShareCorporationBusAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezDevShareCorporationBusAddException(sb.toString());
	}

	/**
	 * Returns the last sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez dev share corporation bus add, or <code>null</code> if a matching sez dev share corporation bus add could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezDevShareCorporationBusAdd> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez dev share corporation bus adds before and after the current sez dev share corporation bus add in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the current sez dev share corporation bus add
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd[] findBygetSezStatusByAppId_PrevAndNext(
			long sezDevCorporationBusinessAddId, long sezStatusApplicationId,
			OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator)
		throws NoSuchSezDevShareCorporationBusAddException {

		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd =
			findByPrimaryKey(sezDevCorporationBusinessAddId);

		Session session = null;

		try {
			session = openSession();

			SezDevShareCorporationBusAdd[] array =
				new SezDevShareCorporationBusAddImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevShareCorporationBusAdd, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezDevShareCorporationBusAdd;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezDevShareCorporationBusAdd, sezStatusApplicationId,
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

	protected SezDevShareCorporationBusAdd getBygetSezStatusByAppId_PrevAndNext(
		Session session,
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd,
		long sezStatusApplicationId,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD_WHERE);

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
			sb.append(SezDevShareCorporationBusAddModelImpl.ORDER_BY_JPQL);
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
						sezDevShareCorporationBusAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezDevShareCorporationBusAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez dev share corporation bus adds where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezDevShareCorporationBusAdd);
		}
	}

	/**
	 * Returns the number of sez dev share corporation bus adds where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev share corporation bus adds
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVSHARECORPORATIONBUSADD_WHERE);

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
			"sezDevShareCorporationBusAdd.sezStatusApplicationId = ?";

	public SezDevShareCorporationBusAddPersistenceImpl() {
		setModelClass(SezDevShareCorporationBusAdd.class);

		setModelImplClass(SezDevShareCorporationBusAddImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevShareCorporationBusAddTable.INSTANCE);
	}

	/**
	 * Caches the sez dev share corporation bus add in the entity cache if it is enabled.
	 *
	 * @param sezDevShareCorporationBusAdd the sez dev share corporation bus add
	 */
	@Override
	public void cacheResult(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		entityCache.putResult(
			SezDevShareCorporationBusAddImpl.class,
			sezDevShareCorporationBusAdd.getPrimaryKey(),
			sezDevShareCorporationBusAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev share corporation bus adds in the entity cache if it is enabled.
	 *
	 * @param sezDevShareCorporationBusAdds the sez dev share corporation bus adds
	 */
	@Override
	public void cacheResult(
		List<SezDevShareCorporationBusAdd> sezDevShareCorporationBusAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevShareCorporationBusAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd :
				sezDevShareCorporationBusAdds) {

			if (entityCache.getResult(
					SezDevShareCorporationBusAddImpl.class,
					sezDevShareCorporationBusAdd.getPrimaryKey()) == null) {

				cacheResult(sezDevShareCorporationBusAdd);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev share corporation bus adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevShareCorporationBusAddImpl.class);

		finderCache.clearCache(SezDevShareCorporationBusAddImpl.class);
	}

	/**
	 * Clears the cache for the sez dev share corporation bus add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		entityCache.removeResult(
			SezDevShareCorporationBusAddImpl.class,
			sezDevShareCorporationBusAdd);
	}

	@Override
	public void clearCache(
		List<SezDevShareCorporationBusAdd> sezDevShareCorporationBusAdds) {

		for (SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd :
				sezDevShareCorporationBusAdds) {

			entityCache.removeResult(
				SezDevShareCorporationBusAddImpl.class,
				sezDevShareCorporationBusAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevShareCorporationBusAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevShareCorporationBusAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez dev share corporation bus add with the primary key. Does not add the sez dev share corporation bus add to the database.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key for the new sez dev share corporation bus add
	 * @return the new sez dev share corporation bus add
	 */
	@Override
	public SezDevShareCorporationBusAdd create(
		long sezDevCorporationBusinessAddId) {

		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd =
			new SezDevShareCorporationBusAddImpl();

		sezDevShareCorporationBusAdd.setNew(true);
		sezDevShareCorporationBusAdd.setPrimaryKey(
			sezDevCorporationBusinessAddId);

		sezDevShareCorporationBusAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevShareCorporationBusAdd;
	}

	/**
	 * Removes the sez dev share corporation bus add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was removed
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd remove(
			long sezDevCorporationBusinessAddId)
		throws NoSuchSezDevShareCorporationBusAddException {

		return remove((Serializable)sezDevCorporationBusinessAddId);
	}

	/**
	 * Removes the sez dev share corporation bus add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add that was removed
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd remove(Serializable primaryKey)
		throws NoSuchSezDevShareCorporationBusAddException {

		Session session = null;

		try {
			session = openSession();

			SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd =
				(SezDevShareCorporationBusAdd)session.get(
					SezDevShareCorporationBusAddImpl.class, primaryKey);

			if (sezDevShareCorporationBusAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevShareCorporationBusAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevShareCorporationBusAdd);
		}
		catch (NoSuchSezDevShareCorporationBusAddException
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
	protected SezDevShareCorporationBusAdd removeImpl(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevShareCorporationBusAdd)) {
				sezDevShareCorporationBusAdd =
					(SezDevShareCorporationBusAdd)session.get(
						SezDevShareCorporationBusAddImpl.class,
						sezDevShareCorporationBusAdd.getPrimaryKeyObj());
			}

			if (sezDevShareCorporationBusAdd != null) {
				session.delete(sezDevShareCorporationBusAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevShareCorporationBusAdd != null) {
			clearCache(sezDevShareCorporationBusAdd);
		}

		return sezDevShareCorporationBusAdd;
	}

	@Override
	public SezDevShareCorporationBusAdd updateImpl(
		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd) {

		boolean isNew = sezDevShareCorporationBusAdd.isNew();

		if (!(sezDevShareCorporationBusAdd instanceof
				SezDevShareCorporationBusAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezDevShareCorporationBusAdd.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevShareCorporationBusAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevShareCorporationBusAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevShareCorporationBusAdd implementation " +
					sezDevShareCorporationBusAdd.getClass());
		}

		SezDevShareCorporationBusAddModelImpl
			sezDevShareCorporationBusAddModelImpl =
				(SezDevShareCorporationBusAddModelImpl)
					sezDevShareCorporationBusAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevShareCorporationBusAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevShareCorporationBusAdd.setCreateDate(date);
			}
			else {
				sezDevShareCorporationBusAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevShareCorporationBusAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevShareCorporationBusAdd.setModifiedDate(date);
			}
			else {
				sezDevShareCorporationBusAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevShareCorporationBusAdd);
			}
			else {
				sezDevShareCorporationBusAdd =
					(SezDevShareCorporationBusAdd)session.merge(
						sezDevShareCorporationBusAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevShareCorporationBusAddImpl.class,
			sezDevShareCorporationBusAddModelImpl, false, true);

		if (isNew) {
			sezDevShareCorporationBusAdd.setNew(false);
		}

		sezDevShareCorporationBusAdd.resetOriginalValues();

		return sezDevShareCorporationBusAdd;
	}

	/**
	 * Returns the sez dev share corporation bus add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezDevShareCorporationBusAddException {

		SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd =
			fetchByPrimaryKey(primaryKey);

		if (sezDevShareCorporationBusAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevShareCorporationBusAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevShareCorporationBusAdd;
	}

	/**
	 * Returns the sez dev share corporation bus add with the primary key or throws a <code>NoSuchSezDevShareCorporationBusAddException</code> if it could not be found.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add
	 * @throws NoSuchSezDevShareCorporationBusAddException if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd findByPrimaryKey(
			long sezDevCorporationBusinessAddId)
		throws NoSuchSezDevShareCorporationBusAddException {

		return findByPrimaryKey((Serializable)sezDevCorporationBusinessAddId);
	}

	/**
	 * Returns the sez dev share corporation bus add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevCorporationBusinessAddId the primary key of the sez dev share corporation bus add
	 * @return the sez dev share corporation bus add, or <code>null</code> if a sez dev share corporation bus add with the primary key could not be found
	 */
	@Override
	public SezDevShareCorporationBusAdd fetchByPrimaryKey(
		long sezDevCorporationBusinessAddId) {

		return fetchByPrimaryKey((Serializable)sezDevCorporationBusinessAddId);
	}

	/**
	 * Returns all the sez dev share corporation bus adds.
	 *
	 * @return the sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @return the range of sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev share corporation bus adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareCorporationBusAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share corporation bus adds
	 * @param end the upper bound of the range of sez dev share corporation bus adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev share corporation bus adds
	 */
	@Override
	public List<SezDevShareCorporationBusAdd> findAll(
		int start, int end,
		OrderByComparator<SezDevShareCorporationBusAdd> orderByComparator,
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

		List<SezDevShareCorporationBusAdd> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareCorporationBusAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD;

				sql = sql.concat(
					SezDevShareCorporationBusAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevShareCorporationBusAdd>)QueryUtil.list(
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
	 * Removes all the sez dev share corporation bus adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd :
				findAll()) {

			remove(sezDevShareCorporationBusAdd);
		}
	}

	/**
	 * Returns the number of sez dev share corporation bus adds.
	 *
	 * @return the number of sez dev share corporation bus adds
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
					_SQL_COUNT_SEZDEVSHARECORPORATIONBUSADD);

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
		return "sezDevCorporationBusinessAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevShareCorporationBusAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev share corporation bus add persistence.
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

		SezDevShareCorporationBusAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevShareCorporationBusAddUtil.setPersistence(null);

		entityCache.removeCache(
			SezDevShareCorporationBusAddImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD =
		"SELECT sezDevShareCorporationBusAdd FROM SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd";

	private static final String _SQL_SELECT_SEZDEVSHARECORPORATIONBUSADD_WHERE =
		"SELECT sezDevShareCorporationBusAdd FROM SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd WHERE ";

	private static final String _SQL_COUNT_SEZDEVSHARECORPORATIONBUSADD =
		"SELECT COUNT(sezDevShareCorporationBusAdd) FROM SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd";

	private static final String _SQL_COUNT_SEZDEVSHARECORPORATIONBUSADD_WHERE =
		"SELECT COUNT(sezDevShareCorporationBusAdd) FROM SezDevShareCorporationBusAdd sezDevShareCorporationBusAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevShareCorporationBusAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevShareCorporationBusAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevShareCorporationBusAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevShareCorporationBusAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}