/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransBoxException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBoxTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransBoxUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

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
 * The persistence implementation for the tourism bona ground trans box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaGroundTransBoxPersistence.class)
public class TourismBonaGroundTransBoxPersistenceImpl
	extends BasePersistenceImpl<TourismBonaGroundTransBox>
	implements TourismBonaGroundTransBoxPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaGroundTransBoxUtil</code> to access the tourism bona ground trans box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaGroundTransBoxImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetTAP_TAI;
	private FinderPath _finderPathWithoutPaginationFindBygetTAP_TAI;
	private FinderPath _finderPathCountBygetTAP_TAI;

	/**
	 * Returns all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return findBygetTAP_TAI(
			tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of matching tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return findBygetTAP_TAI(tourismApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetTAP_TAI;
				finderArgs = new Object[] {tourismApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTAP_TAI;
			finderArgs = new Object[] {
				tourismApplicationId, start, end, orderByComparator
			};
		}

		List<TourismBonaGroundTransBox> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaGroundTransBox>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismBonaGroundTransBox tourismBonaGroundTransBox :
						list) {

					if (tourismApplicationId !=
							tourismBonaGroundTransBox.
								getTourismApplicationId()) {

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

			sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismBonaGroundTransBoxModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				list = (List<TourismBonaGroundTransBox>)QueryUtil.list(
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
	 * Returns the first tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a matching tourism bona ground trans box could not be found
	 */
	@Override
	public TourismBonaGroundTransBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismBonaGroundTransBox> orderByComparator)
		throws NoSuchTourismBonaGroundTransBoxException {

		TourismBonaGroundTransBox tourismBonaGroundTransBox =
			fetchBygetTAP_TAI_First(tourismApplicationId, orderByComparator);

		if (tourismBonaGroundTransBox != null) {
			return tourismBonaGroundTransBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismBonaGroundTransBoxException(sb.toString());
	}

	/**
	 * Returns the first tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona ground trans box, or <code>null</code> if a matching tourism bona ground trans box could not be found
	 */
	@Override
	public TourismBonaGroundTransBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		List<TourismBonaGroundTransBox> list = findBygetTAP_TAI(
			tourismApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a matching tourism bona ground trans box could not be found
	 */
	@Override
	public TourismBonaGroundTransBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismBonaGroundTransBox> orderByComparator)
		throws NoSuchTourismBonaGroundTransBoxException {

		TourismBonaGroundTransBox tourismBonaGroundTransBox =
			fetchBygetTAP_TAI_Last(tourismApplicationId, orderByComparator);

		if (tourismBonaGroundTransBox != null) {
			return tourismBonaGroundTransBox;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("tourismApplicationId=");
		sb.append(tourismApplicationId);

		sb.append("}");

		throw new NoSuchTourismBonaGroundTransBoxException(sb.toString());
	}

	/**
	 * Returns the last tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona ground trans box, or <code>null</code> if a matching tourism bona ground trans box could not be found
	 */
	@Override
	public TourismBonaGroundTransBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		int count = countBygetTAP_TAI(tourismApplicationId);

		if (count == 0) {
			return null;
		}

		List<TourismBonaGroundTransBox> list = findBygetTAP_TAI(
			tourismApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism bona ground trans boxes before and after the current tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the current tourism bona ground trans box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismVehicleBoxBonaId, long tourismApplicationId,
			OrderByComparator<TourismBonaGroundTransBox> orderByComparator)
		throws NoSuchTourismBonaGroundTransBoxException {

		TourismBonaGroundTransBox tourismBonaGroundTransBox = findByPrimaryKey(
			tourismVehicleBoxBonaId);

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundTransBox[] array =
				new TourismBonaGroundTransBoxImpl[3];

			array[0] = getBygetTAP_TAI_PrevAndNext(
				session, tourismBonaGroundTransBox, tourismApplicationId,
				orderByComparator, true);

			array[1] = tourismBonaGroundTransBox;

			array[2] = getBygetTAP_TAI_PrevAndNext(
				session, tourismBonaGroundTransBox, tourismApplicationId,
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

	protected TourismBonaGroundTransBox getBygetTAP_TAI_PrevAndNext(
		Session session, TourismBonaGroundTransBox tourismBonaGroundTransBox,
		long tourismApplicationId,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSBOX_WHERE);

		sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

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
			sb.append(TourismBonaGroundTransBoxModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(tourismApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						tourismBonaGroundTransBox)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismBonaGroundTransBox> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism bona ground trans boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	@Override
	public void removeBygetTAP_TAI(long tourismApplicationId) {
		for (TourismBonaGroundTransBox tourismBonaGroundTransBox :
				findBygetTAP_TAI(
					tourismApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismBonaGroundTransBox);
		}
	}

	/**
	 * Returns the number of tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground trans boxes
	 */
	@Override
	public int countBygetTAP_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTAP_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDTRANSBOX_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2 =
			"tourismBonaGroundTransBox.tourismApplicationId = ?";

	public TourismBonaGroundTransBoxPersistenceImpl() {
		setModelClass(TourismBonaGroundTransBox.class);

		setModelImplClass(TourismBonaGroundTransBoxImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaGroundTransBoxTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona ground trans box in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransBox the tourism bona ground trans box
	 */
	@Override
	public void cacheResult(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		entityCache.putResult(
			TourismBonaGroundTransBoxImpl.class,
			tourismBonaGroundTransBox.getPrimaryKey(),
			tourismBonaGroundTransBox);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona ground trans boxes in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransBoxes the tourism bona ground trans boxes
	 */
	@Override
	public void cacheResult(
		List<TourismBonaGroundTransBox> tourismBonaGroundTransBoxes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaGroundTransBoxes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaGroundTransBox tourismBonaGroundTransBox :
				tourismBonaGroundTransBoxes) {

			if (entityCache.getResult(
					TourismBonaGroundTransBoxImpl.class,
					tourismBonaGroundTransBox.getPrimaryKey()) == null) {

				cacheResult(tourismBonaGroundTransBox);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona ground trans boxes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaGroundTransBoxImpl.class);

		finderCache.clearCache(TourismBonaGroundTransBoxImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona ground trans box.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		entityCache.removeResult(
			TourismBonaGroundTransBoxImpl.class, tourismBonaGroundTransBox);
	}

	@Override
	public void clearCache(
		List<TourismBonaGroundTransBox> tourismBonaGroundTransBoxes) {

		for (TourismBonaGroundTransBox tourismBonaGroundTransBox :
				tourismBonaGroundTransBoxes) {

			entityCache.removeResult(
				TourismBonaGroundTransBoxImpl.class, tourismBonaGroundTransBox);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaGroundTransBoxImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaGroundTransBoxImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new tourism bona ground trans box with the primary key. Does not add the tourism bona ground trans box to the database.
	 *
	 * @param tourismVehicleBoxBonaId the primary key for the new tourism bona ground trans box
	 * @return the new tourism bona ground trans box
	 */
	@Override
	public TourismBonaGroundTransBox create(long tourismVehicleBoxBonaId) {
		TourismBonaGroundTransBox tourismBonaGroundTransBox =
			new TourismBonaGroundTransBoxImpl();

		tourismBonaGroundTransBox.setNew(true);
		tourismBonaGroundTransBox.setPrimaryKey(tourismVehicleBoxBonaId);

		tourismBonaGroundTransBox.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaGroundTransBox;
	}

	/**
	 * Removes the tourism bona ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was removed
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransBox remove(long tourismVehicleBoxBonaId)
		throws NoSuchTourismBonaGroundTransBoxException {

		return remove((Serializable)tourismVehicleBoxBonaId);
	}

	/**
	 * Removes the tourism bona ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was removed
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransBox remove(Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransBoxException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundTransBox tourismBonaGroundTransBox =
				(TourismBonaGroundTransBox)session.get(
					TourismBonaGroundTransBoxImpl.class, primaryKey);

			if (tourismBonaGroundTransBox == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaGroundTransBoxException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaGroundTransBox);
		}
		catch (NoSuchTourismBonaGroundTransBoxException noSuchEntityException) {
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
	protected TourismBonaGroundTransBox removeImpl(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaGroundTransBox)) {
				tourismBonaGroundTransBox =
					(TourismBonaGroundTransBox)session.get(
						TourismBonaGroundTransBoxImpl.class,
						tourismBonaGroundTransBox.getPrimaryKeyObj());
			}

			if (tourismBonaGroundTransBox != null) {
				session.delete(tourismBonaGroundTransBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaGroundTransBox != null) {
			clearCache(tourismBonaGroundTransBox);
		}

		return tourismBonaGroundTransBox;
	}

	@Override
	public TourismBonaGroundTransBox updateImpl(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		boolean isNew = tourismBonaGroundTransBox.isNew();

		if (!(tourismBonaGroundTransBox instanceof
				TourismBonaGroundTransBoxModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismBonaGroundTransBox.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaGroundTransBox);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaGroundTransBox proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaGroundTransBox implementation " +
					tourismBonaGroundTransBox.getClass());
		}

		TourismBonaGroundTransBoxModelImpl tourismBonaGroundTransBoxModelImpl =
			(TourismBonaGroundTransBoxModelImpl)tourismBonaGroundTransBox;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaGroundTransBox.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaGroundTransBox.setCreateDate(date);
			}
			else {
				tourismBonaGroundTransBox.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaGroundTransBoxModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaGroundTransBox.setModifiedDate(date);
			}
			else {
				tourismBonaGroundTransBox.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaGroundTransBox);
			}
			else {
				tourismBonaGroundTransBox =
					(TourismBonaGroundTransBox)session.merge(
						tourismBonaGroundTransBox);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaGroundTransBoxImpl.class,
			tourismBonaGroundTransBoxModelImpl, false, true);

		if (isNew) {
			tourismBonaGroundTransBox.setNew(false);
		}

		tourismBonaGroundTransBox.resetOriginalValues();

		return tourismBonaGroundTransBox;
	}

	/**
	 * Returns the tourism bona ground trans box with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransBox findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransBoxException {

		TourismBonaGroundTransBox tourismBonaGroundTransBox = fetchByPrimaryKey(
			primaryKey);

		if (tourismBonaGroundTransBox == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaGroundTransBoxException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaGroundTransBox;
	}

	/**
	 * Returns the tourism bona ground trans box with the primary key or throws a <code>NoSuchTourismBonaGroundTransBoxException</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransBox findByPrimaryKey(
			long tourismVehicleBoxBonaId)
		throws NoSuchTourismBonaGroundTransBoxException {

		return findByPrimaryKey((Serializable)tourismVehicleBoxBonaId);
	}

	/**
	 * Returns the tourism bona ground trans box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box, or <code>null</code> if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransBox fetchByPrimaryKey(
		long tourismVehicleBoxBonaId) {

		return fetchByPrimaryKey((Serializable)tourismVehicleBoxBonaId);
	}

	/**
	 * Returns all the tourism bona ground trans boxes.
	 *
	 * @return the tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground trans boxes
	 */
	@Override
	public List<TourismBonaGroundTransBox> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator,
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

		List<TourismBonaGroundTransBox> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaGroundTransBox>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSBOX);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAGROUNDTRANSBOX;

				sql = sql.concat(
					TourismBonaGroundTransBoxModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaGroundTransBox>)QueryUtil.list(
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
	 * Removes all the tourism bona ground trans boxes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaGroundTransBox tourismBonaGroundTransBox : findAll()) {
			remove(tourismBonaGroundTransBox);
		}
	}

	/**
	 * Returns the number of tourism bona ground trans boxes.
	 *
	 * @return the number of tourism bona ground trans boxes
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
					_SQL_COUNT_TOURISMBONAGROUNDTRANSBOX);

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
		return "tourismVehicleBoxBonaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAGROUNDTRANSBOX;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaGroundTransBoxModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona ground trans box persistence.
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

		_finderPathWithPaginationFindBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTAP_TAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"tourismApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismBonaGroundTransBoxUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaGroundTransBoxUtil.setPersistence(null);

		entityCache.removeCache(TourismBonaGroundTransBoxImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMBONAGROUNDTRANSBOX =
		"SELECT tourismBonaGroundTransBox FROM TourismBonaGroundTransBox tourismBonaGroundTransBox";

	private static final String _SQL_SELECT_TOURISMBONAGROUNDTRANSBOX_WHERE =
		"SELECT tourismBonaGroundTransBox FROM TourismBonaGroundTransBox tourismBonaGroundTransBox WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAGROUNDTRANSBOX =
		"SELECT COUNT(tourismBonaGroundTransBox) FROM TourismBonaGroundTransBox tourismBonaGroundTransBox";

	private static final String _SQL_COUNT_TOURISMBONAGROUNDTRANSBOX_WHERE =
		"SELECT COUNT(tourismBonaGroundTransBox) FROM TourismBonaGroundTransBox tourismBonaGroundTransBox WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaGroundTransBox.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaGroundTransBox exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaGroundTransBox exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaGroundTransBoxPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}