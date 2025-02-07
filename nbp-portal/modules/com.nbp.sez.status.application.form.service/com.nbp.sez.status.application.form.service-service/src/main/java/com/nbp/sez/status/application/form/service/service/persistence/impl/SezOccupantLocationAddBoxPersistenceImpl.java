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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantLocationAddBoxException;
import com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBox;
import com.nbp.sez.status.application.form.service.model.SezOccupantLocationAddBoxTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantLocationAddBoxPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantLocationAddBoxUtil;
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
 * The persistence implementation for the sez occupant location add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantLocationAddBoxPersistence.class)
public class SezOccupantLocationAddBoxPersistenceImpl
	extends BasePersistenceImpl<SezOccupantLocationAddBox>
	implements SezOccupantLocationAddBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantLocationAddBoxUtil</code> to access the sez occupant location add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantLocationAddBoxImpl.class.getName();

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
	 * Returns all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of matching sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator,
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

		List<SezOccupantLocationAddBox> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantLocationAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccupantLocationAddBox sezOccupantLocationAddBox :
						list) {

					if (sezStatusApplicationId !=
							sezOccupantLocationAddBox.
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

			sb.append(_SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezOccupantLocationAddBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezOccupantLocationAddBox>)QueryUtil.list(
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
	 * Returns the first sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a matching sez occupant location add box could not be found
	 */
	@Override
	public SezOccupantLocationAddBox findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantLocationAddBox> orderByComparator)
		throws NoSuchSezOccupantLocationAddBoxException {

		SezOccupantLocationAddBox sezOccupantLocationAddBox =
			fetchBygetSezStatusByAppId_First(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantLocationAddBox != null) {
			return sezOccupantLocationAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantLocationAddBoxException(sb.toString());
	}

	/**
	 * Returns the first sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant location add box, or <code>null</code> if a matching sez occupant location add box could not be found
	 */
	@Override
	public SezOccupantLocationAddBox fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		List<SezOccupantLocationAddBox> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a matching sez occupant location add box could not be found
	 */
	@Override
	public SezOccupantLocationAddBox findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantLocationAddBox> orderByComparator)
		throws NoSuchSezOccupantLocationAddBoxException {

		SezOccupantLocationAddBox sezOccupantLocationAddBox =
			fetchBygetSezStatusByAppId_Last(
				sezStatusApplicationId, orderByComparator);

		if (sezOccupantLocationAddBox != null) {
			return sezOccupantLocationAddBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantLocationAddBoxException(sb.toString());
	}

	/**
	 * Returns the last sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant location add box, or <code>null</code> if a matching sez occupant location add box could not be found
	 */
	@Override
	public SezOccupantLocationAddBox fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccupantLocationAddBox> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occupant location add boxes before and after the current sez occupant location add box in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccLocationId the primary key of the current sez occupant location add box
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public SezOccupantLocationAddBox[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccLocationId, long sezStatusApplicationId,
			OrderByComparator<SezOccupantLocationAddBox> orderByComparator)
		throws NoSuchSezOccupantLocationAddBoxException {

		SezOccupantLocationAddBox sezOccupantLocationAddBox = findByPrimaryKey(
			sezOccLocationId);

		Session session = null;

		try {
			session = openSession();

			SezOccupantLocationAddBox[] array =
				new SezOccupantLocationAddBoxImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantLocationAddBox, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezOccupantLocationAddBox;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantLocationAddBox, sezStatusApplicationId,
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

	protected SezOccupantLocationAddBox getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezOccupantLocationAddBox sezOccupantLocationAddBox,
		long sezStatusApplicationId,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX_WHERE);

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
			sb.append(SezOccupantLocationAddBoxModelImpl.ORDER_BY_JPQL);
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
						sezOccupantLocationAddBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccupantLocationAddBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occupant location add boxes where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezOccupantLocationAddBox sezOccupantLocationAddBox :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezOccupantLocationAddBox);
		}
	}

	/**
	 * Returns the number of sez occupant location add boxes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant location add boxes
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTLOCATIONADDBOX_WHERE);

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
			"sezOccupantLocationAddBox.sezStatusApplicationId = ?";

	public SezOccupantLocationAddBoxPersistenceImpl() {
		setModelClass(SezOccupantLocationAddBox.class);

		setModelImplClass(SezOccupantLocationAddBoxImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantLocationAddBoxTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant location add box in the entity cache if it is enabled.
	 *
	 * @param sezOccupantLocationAddBox the sez occupant location add box
	 */
	@Override
	public void cacheResult(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		entityCache.putResult(
			SezOccupantLocationAddBoxImpl.class,
			sezOccupantLocationAddBox.getPrimaryKey(),
			sezOccupantLocationAddBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant location add boxes in the entity cache if it is enabled.
	 *
	 * @param sezOccupantLocationAddBoxes the sez occupant location add boxes
	 */
	@Override
	public void cacheResult(
		List<SezOccupantLocationAddBox> sezOccupantLocationAddBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantLocationAddBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantLocationAddBox sezOccupantLocationAddBox :
				sezOccupantLocationAddBoxes) {

			if (entityCache.getResult(
					SezOccupantLocationAddBoxImpl.class,
					sezOccupantLocationAddBox.getPrimaryKey()) == null) {

				cacheResult(sezOccupantLocationAddBox);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant location add boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantLocationAddBoxImpl.class);

		finderCache.clearCache(SezOccupantLocationAddBoxImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant location add box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		entityCache.removeResult(
			SezOccupantLocationAddBoxImpl.class, sezOccupantLocationAddBox);
	}

	@Override
	public void clearCache(
		List<SezOccupantLocationAddBox> sezOccupantLocationAddBoxes) {

		for (SezOccupantLocationAddBox sezOccupantLocationAddBox :
				sezOccupantLocationAddBoxes) {

			entityCache.removeResult(
				SezOccupantLocationAddBoxImpl.class, sezOccupantLocationAddBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantLocationAddBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantLocationAddBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez occupant location add box with the primary key. Does not add the sez occupant location add box to the database.
	 *
	 * @param sezOccLocationId the primary key for the new sez occupant location add box
	 * @return the new sez occupant location add box
	 */
	@Override
	public SezOccupantLocationAddBox create(long sezOccLocationId) {
		SezOccupantLocationAddBox sezOccupantLocationAddBox =
			new SezOccupantLocationAddBoxImpl();

		sezOccupantLocationAddBox.setNew(true);
		sezOccupantLocationAddBox.setPrimaryKey(sezOccLocationId);

		sezOccupantLocationAddBox.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantLocationAddBox;
	}

	/**
	 * Removes the sez occupant location add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box that was removed
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public SezOccupantLocationAddBox remove(long sezOccLocationId)
		throws NoSuchSezOccupantLocationAddBoxException {

		return remove((Serializable)sezOccLocationId);
	}

	/**
	 * Removes the sez occupant location add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant location add box
	 * @return the sez occupant location add box that was removed
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public SezOccupantLocationAddBox remove(Serializable primaryKey)
		throws NoSuchSezOccupantLocationAddBoxException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantLocationAddBox sezOccupantLocationAddBox =
				(SezOccupantLocationAddBox)session.get(
					SezOccupantLocationAddBoxImpl.class, primaryKey);

			if (sezOccupantLocationAddBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantLocationAddBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantLocationAddBox);
		}
		catch (NoSuchSezOccupantLocationAddBoxException noSuchEntityException) {
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
	protected SezOccupantLocationAddBox removeImpl(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantLocationAddBox)) {
				sezOccupantLocationAddBox =
					(SezOccupantLocationAddBox)session.get(
						SezOccupantLocationAddBoxImpl.class,
						sezOccupantLocationAddBox.getPrimaryKeyObj());
			}

			if (sezOccupantLocationAddBox != null) {
				session.delete(sezOccupantLocationAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantLocationAddBox != null) {
			clearCache(sezOccupantLocationAddBox);
		}

		return sezOccupantLocationAddBox;
	}

	@Override
	public SezOccupantLocationAddBox updateImpl(
		SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		boolean isNew = sezOccupantLocationAddBox.isNew();

		if (!(sezOccupantLocationAddBox instanceof
				SezOccupantLocationAddBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezOccupantLocationAddBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantLocationAddBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantLocationAddBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantLocationAddBox implementation " +
					sezOccupantLocationAddBox.getClass());
		}

		SezOccupantLocationAddBoxModelImpl sezOccupantLocationAddBoxModelImpl =
			(SezOccupantLocationAddBoxModelImpl)sezOccupantLocationAddBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccupantLocationAddBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccupantLocationAddBox.setCreateDate(date);
			}
			else {
				sezOccupantLocationAddBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantLocationAddBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantLocationAddBox.setModifiedDate(date);
			}
			else {
				sezOccupantLocationAddBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantLocationAddBox);
			}
			else {
				sezOccupantLocationAddBox =
					(SezOccupantLocationAddBox)session.merge(
						sezOccupantLocationAddBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantLocationAddBoxImpl.class,
			sezOccupantLocationAddBoxModelImpl, false, true);

		if (isNew) {
			sezOccupantLocationAddBox.setNew(false);
		}

		sezOccupantLocationAddBox.resetOriginalValues();

		return sezOccupantLocationAddBox;
	}

	/**
	 * Returns the sez occupant location add box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant location add box
	 * @return the sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public SezOccupantLocationAddBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezOccupantLocationAddBoxException {

		SezOccupantLocationAddBox sezOccupantLocationAddBox = fetchByPrimaryKey(
			primaryKey);

		if (sezOccupantLocationAddBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantLocationAddBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantLocationAddBox;
	}

	/**
	 * Returns the sez occupant location add box with the primary key or throws a <code>NoSuchSezOccupantLocationAddBoxException</code> if it could not be found.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box
	 * @throws NoSuchSezOccupantLocationAddBoxException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public SezOccupantLocationAddBox findByPrimaryKey(long sezOccLocationId)
		throws NoSuchSezOccupantLocationAddBoxException {

		return findByPrimaryKey((Serializable)sezOccLocationId);
	}

	/**
	 * Returns the sez occupant location add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box, or <code>null</code> if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public SezOccupantLocationAddBox fetchByPrimaryKey(long sezOccLocationId) {
		return fetchByPrimaryKey((Serializable)sezOccLocationId);
	}

	/**
	 * Returns all the sez occupant location add boxes.
	 *
	 * @return the sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findAll(
		int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant location add boxes
	 */
	@Override
	public List<SezOccupantLocationAddBox> findAll(
		int start, int end,
		OrderByComparator<SezOccupantLocationAddBox> orderByComparator,
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

		List<SezOccupantLocationAddBox> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantLocationAddBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX;

				sql = sql.concat(
					SezOccupantLocationAddBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantLocationAddBox>)QueryUtil.list(
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
	 * Removes all the sez occupant location add boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantLocationAddBox sezOccupantLocationAddBox : findAll()) {
			remove(sezOccupantLocationAddBox);
		}
	}

	/**
	 * Returns the number of sez occupant location add boxes.
	 *
	 * @return the number of sez occupant location add boxes
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
					_SQL_COUNT_SEZOCCUPANTLOCATIONADDBOX);

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
		return "sezOccLocationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantLocationAddBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant location add box persistence.
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

		SezOccupantLocationAddBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantLocationAddBoxUtil.setPersistence(null);

		entityCache.removeCache(SezOccupantLocationAddBoxImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX =
		"SELECT sezOccupantLocationAddBox FROM SezOccupantLocationAddBox sezOccupantLocationAddBox";

	private static final String _SQL_SELECT_SEZOCCUPANTLOCATIONADDBOX_WHERE =
		"SELECT sezOccupantLocationAddBox FROM SezOccupantLocationAddBox sezOccupantLocationAddBox WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTLOCATIONADDBOX =
		"SELECT COUNT(sezOccupantLocationAddBox) FROM SezOccupantLocationAddBox sezOccupantLocationAddBox";

	private static final String _SQL_COUNT_SEZOCCUPANTLOCATIONADDBOX_WHERE =
		"SELECT COUNT(sezOccupantLocationAddBox) FROM SezOccupantLocationAddBox sezOccupantLocationAddBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantLocationAddBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantLocationAddBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantLocationAddBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantLocationAddBoxPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}